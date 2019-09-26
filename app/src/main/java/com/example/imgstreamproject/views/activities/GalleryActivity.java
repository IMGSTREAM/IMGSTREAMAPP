package com.example.imgstreamproject.views.activities;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.Switch;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.imgstreamproject.R;
import com.example.imgstreamproject.api.imgur.data.models.GalleryItem;
import com.example.imgstreamproject.api.imgur.endpoint.Section;
import com.example.imgstreamproject.api.imgur.endpoint.Sort;
import com.example.imgstreamproject.api.imgur.endpoint.responses.GalleryResponseAsync;
import com.example.imgstreamproject.api.imgur.endpoint.services.GalleryService;
import com.example.imgstreamproject.views.BaseActivity;
import com.example.imgstreamproject.views.adapters.recyclers.GalleryRecyclerAdapter;
import com.example.imgstreamproject.views.adapters.recyclers.ViewManager;

import java.util.ArrayList;
import java.util.List;

public class GalleryActivity extends BaseActivity {

    private Section section;
    private Sort sort;
    private Integer page;
    private Boolean showViral;

    private List<GalleryItem> data;

    private GalleryService galleryService;

    //VIEWS
    private Spinner spnViewMode;
    private Spinner spnSection;
    private Spinner spnSort;

    private Switch swtShowViral;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter rvAdapter;
    private RecyclerView.LayoutManager rvLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        setTheme(R.style.AppTheme_Main);

        initView();
        initData();
    }

    private void initView() {
        spnViewMode = findViewById(R.id.activity_gallery_spn_view_mode);
        spnViewMode.setAdapter(new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, ViewManager.values()));
        spnViewMode.setOnItemSelectedListener(spnViewModeOnItemSelectedListener());

        spnSection = findViewById(R.id.activity_gallery_spn_section);
        spnSection.setAdapter(new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, Section.values()));
        spnSection.setOnItemSelectedListener(spnSectionOnItemSelectedListener());

        spnSort = findViewById(R.id.activity_gallery_spn_sort);
        spnSort.setAdapter(new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, Sort.values()));
        spnSort.setOnItemSelectedListener(spnSortOnItemSelectedListener());

        swtShowViral = findViewById(R.id.activity_gallery_swt_show_viral);
        swtShowViral.setOnCheckedChangeListener((cb, b) -> swtShowViralOnCheckedChangeListener(cb, b));

        recyclerView = findViewById(R.id.activity_gallery_rv_gallery);
        rvLayoutManager = new GridLayoutManager(this, 2);
        setRecyclerViewAdapter();
    }

    private void initData() {
        galleryService = new GalleryResponseAsync();
        section = Section.HOT;
        sort = Sort.VIRAL;
        page = 0;
        showViral = true;
        data = new ArrayList<>();
        loadData();
    }

    private void loadData() {
        Log.i("GalleryActivity", String.valueOf(section));
        galleryService.getGallery(section, sort, page, showViral, data -> {
            this.data = (List<GalleryItem>) data;
            setRecyclerViewAdapter();
        });
    }

    //LISTENERS
    private AdapterView.OnItemSelectedListener spnViewModeOnItemSelectedListener() {
        return new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                ViewManager viewManager = (ViewManager) parent.getItemAtPosition(pos);
                setRecyclerViewLayoutManager(viewManager);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        };
    }

    private AdapterView.OnItemSelectedListener spnSectionOnItemSelectedListener() {
        return new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                section = (Section) parent.getItemAtPosition(pos);
                loadData();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        };
    }

    private AdapterView.OnItemSelectedListener spnSortOnItemSelectedListener() {
        return new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                sort = (Sort) parent.getItemAtPosition(pos);
                loadData();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        };
    }

    private void swtShowViralOnCheckedChangeListener(CompoundButton compoundButton, boolean b) {
        showViral = b;
        loadData();
    }

    private void setRecyclerViewLayoutManager(ViewManager viewManager) {
        switch (viewManager) {
            case GRID:
                rvLayoutManager = new GridLayoutManager(this, 2);
                break;
            case FLOW:
                rvLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
                break;
            case LINE:
                rvLayoutManager = new LinearLayoutManager(this);
                break;
        }
        recyclerView.setLayoutManager(rvLayoutManager);
    }

    private void setRecyclerViewAdapter() {
        rvAdapter = new GalleryRecyclerAdapter(this, data);
        recyclerView.setAdapter(rvAdapter);
    }

}
