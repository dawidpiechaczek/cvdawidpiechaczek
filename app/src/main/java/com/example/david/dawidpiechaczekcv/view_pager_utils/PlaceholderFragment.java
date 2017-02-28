package com.example.david.dawidpiechaczekcv.view_pager_utils;

import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.david.dawidpiechaczekcv.R;

/**
 * Created by Dawid on 07.02.2017.
 */

public class PlaceholderFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";
    private static final String CASE_KASZUBY = "Kaszuby";
    private static final String CASE_SKNERUS = "Sknerus.pl";
    private static Context mContext;

    public PlaceholderFragment() {
    }

    public static PlaceholderFragment newInstance(Context context, int sectionNumber) {
        mContext = context;
        PlaceholderFragment fragment = new PlaceholderFragment();
        Bundle args = new Bundle();
        args.putString(ARG_SECTION_NUMBER, setNameString(sectionNumber));
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String projectName = getArguments().getString(ARG_SECTION_NUMBER);
        final String projectDescription, projectLink;
        View rootView = inflater.inflate(R.layout.activity_projects, container, false);
        ImageView arrowLeft = (ImageView) rootView.findViewById(R.id.iv_arrow_left);
        ImageView arrowRight = (ImageView) rootView.findViewById(R.id.iv_arrow_right);
        switch (projectName) {
            case CASE_KASZUBY:
                arrowLeft.setVisibility(View.INVISIBLE);
                arrowRight.setVisibility(View.VISIBLE);
                projectDescription = mContext.getString(R.string.pf_description_kaszuby);
                projectLink = mContext.getString(R.string.pf_link_kaszuby);
                break;
            case CASE_SKNERUS:
                arrowLeft.setVisibility(View.VISIBLE);
                arrowRight.setVisibility(View.INVISIBLE);
                projectDescription = mContext.getString(R.string.pf_description_sknerus);
                projectLink = mContext.getString(R.string.pf_link_sknerus);
                break;
            default:
                arrowLeft.setVisibility(View.VISIBLE);
                arrowRight.setVisibility(View.VISIBLE);
                projectDescription = mContext.getString(R.string.pf_description_gps);
                projectLink = mContext.getString(R.string.pf_link_gps);
        }
        TextView textView = (TextView) rootView.findViewById(R.id.ap_tv_title);
        TextView textView2 = (TextView) rootView.findViewById(R.id.ap_tv_descripsion);
        TextView textView3 = (TextView) rootView.findViewById(R.id.ap_tv_link);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWebURL(projectLink);
            }
        });

        textView.setText(projectName);
        textView2.setText(projectDescription);
        textView3.setText(projectLink);
        textView3.setPaintFlags(textView3.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        return rootView;
    }

    private static String setNameString(int sectionNumber) {
        String str;
        switch (sectionNumber) {
            case 1:
                str = mContext.getString(R.string.pf_name_kaszuby);
                break;
            case 2:
                str = mContext.getString(R.string.pf_name_gps);
                break;
            default:
                str = mContext.getString(R.string.pf_name_sknerus);
                break;
        }
        return str;
    }

    private void openWebURL(String inURL) {
        Intent browse = new Intent(Intent.ACTION_VIEW, Uri.parse(inURL));
        startActivity(browse);
    }
}
