package com.developers.paras.droidwatch;


import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ArduinoFragment extends Fragment {


    View v;
    public ArduinoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.fragment_arduino, container, false);
        // Inflate the layout for this fragment
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        WebView webView = v.findViewById(R.id.web);
        WebSettings w = webView.getSettings();
        w.setJavaScriptEnabled(true);
        w.setBuiltInZoomControls(true);
        webView.loadUrl("https://www.arduino.cc/en/Guide/Introduction");
    }
}
