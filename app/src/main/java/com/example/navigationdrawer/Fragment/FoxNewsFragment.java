package com.example.navigationdrawer.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.example.navigationdrawer.R;
import com.example.navigationdrawer.WebViewController;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FoxNewsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FoxNewsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FoxNewsFragment() {
        // Required empty public constructor
    }

    public static FoxNewsFragment newInstance(String param1, String param2) {
        FoxNewsFragment fragment = new FoxNewsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_fox_news, container, false);

        WebView webView = view.findViewById(R.id.webViewFox);
        webView.loadUrl("https://www.foxnews.com/");
        webView.setWebViewClient(new WebViewController());


        return view;
    }
}