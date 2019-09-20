package com.example.imgstreamproject.view.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.imgstreamproject.R;
import com.example.imgstreamproject.view.custom.ExpandableTextView;

public class AppInfoFragment extends Fragment {

    private String APP_INFO_ABOUT;
    private String APP_INFO_AUTHOR;

    private ExpandableTextView tvAbout;
    private TextView tvAuthor;

    public AppInfoFragment() {
    }

    public static AppInfoFragment newInstance() {
        AppInfoFragment fragment = new AppInfoFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        APP_INFO_ABOUT = getActivity().getResources().getString(R.string.lorem_ipsum);
        APP_INFO_AUTHOR = getActivity().getResources().getString(R.string.app_info_author);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.i("AppInfoFragment", "onCreateView");
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_app_info, container, false);
        tvAbout = view.findViewById(R.id.fragment_app_info_expandable_text_view_about);
        tvAuthor = view.findViewById(R.id.fragment_app_info_text_view_author);

        tvAuthor.setText(APP_INFO_AUTHOR);
        tvAbout.setText(APP_INFO_ABOUT);
        return view;
    }
}
