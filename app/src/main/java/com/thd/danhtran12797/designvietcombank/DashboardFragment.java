package com.thd.danhtran12797.designvietcombank;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thd.danhtran12797.designvietcombank.apdater.BannerAdapter;
import com.thd.danhtran12797.designvietcombank.apdater.OptionAdapter;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DashboardFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DashboardFragment extends Fragment {

    private View view;
    private RecyclerView recyclerBanner;
    private RecyclerView recyclerOption;

    public DashboardFragment() {
        // Required empty public constructor
    }

    public static DashboardFragment newInstance() {
        DashboardFragment fragment = new DashboardFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_dashboard, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        recyclerBanner=view.findViewById(R.id.recycler_banner);
        recyclerOption=view.findViewById(R.id.recycler_option);

        BannerAdapter bannerAdapter=new BannerAdapter();
        recyclerBanner.setAdapter(bannerAdapter);

        OptionAdapter optionAdapter=new OptionAdapter();
        recyclerOption.setAdapter(optionAdapter);
    }
}