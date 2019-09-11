package com.example.imgstreamproject.view.activity;

import android.os.Bundle;
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
import com.example.imgstreamproject.api.imgur.data.model.GalleryItem;
import com.example.imgstreamproject.api.imgur.endpoint.Section;
import com.example.imgstreamproject.api.imgur.endpoint.Sort;
import com.example.imgstreamproject.api.imgur.endpoint.request.GalleryRequest;
import com.example.imgstreamproject.api.imgur.endpoint.response.GalleryResponseAsync;
import com.example.imgstreamproject.api.imgur.endpoint.service.GalleryService;
import com.example.imgstreamproject.view.BaseActivity;
import com.example.imgstreamproject.view.ViewMode;
import com.example.imgstreamproject.view.adapter.GalleryAdapter;

import java.util.ArrayList;
import java.util.List;

public class GalleryActivity extends BaseActivity {

    //SERVICE
    private GalleryRequest galleryRequest = com.example.imgstreamproject.api.imgur.endpoint.adapter.GalleryAdapter.getGalleryRequest();
    private GalleryService galleryService = new GalleryResponseAsync();

    private Section section = Section.hot;
    private Sort sort = Sort.viral;
    private Integer page = 0;
    private Boolean showViral = true;

    //DATA
    private List<GalleryItem> data = new ArrayList<>();

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

        //VIEWS
        initView();

        //DATA
        initData();
    }

    private void initView() {
        spnViewMode = findViewById(R.id.spn_view_mode);
        spnViewMode.setAdapter(new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, ViewMode.values()));
        spnViewMode.setOnItemSelectedListener(spnViewModeOnItemSelectedListener());

        spnSection = findViewById(R.id.spn_section);
        spnSection.setAdapter(new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, Section.values()));
        spnSection.setOnItemSelectedListener(spnSectionOnItemSelectedListener());

        spnSort = findViewById(R.id.spn_sort);
        spnSort.setAdapter(new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, Sort.values()));
        spnSort.setOnItemSelectedListener(spnSortOnItemSelectedListener());

        swtShowViral = findViewById(R.id.swt_show_viral);
        swtShowViral.setOnCheckedChangeListener((cb, b) -> swtShowViralOnCheckedChangeListener(cb, b));

        recyclerView = findViewById(R.id.rv_gallery);
        rvLayoutManager = new GridLayoutManager(this, 2);
        setRecyclerViewAdapter();
    }

    //LISTENERS
    private AdapterView.OnItemSelectedListener spnViewModeOnItemSelectedListener() {
        return new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                ViewMode viewMode = (ViewMode) parent.getItemAtPosition(pos);
                setRecyclerViewLayoutManager(viewMode);
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
                initData();
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
                initData();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        };
    }

    private void swtShowViralOnCheckedChangeListener(CompoundButton compoundButton, boolean b) {
        showViral = b;
        initData();
    }

    private void initData() {
        galleryService.getGallery(section, sort, page, showViral, data -> {
            this.data = (List<GalleryItem>) data;
            setRecyclerViewAdapter();
        });
    }

    private void setRecyclerViewLayoutManager(ViewMode viewMode) {
        switch (viewMode) {
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
        rvAdapter = new GalleryAdapter(this, data);
        recyclerView.setAdapter(rvAdapter);

    }

}
