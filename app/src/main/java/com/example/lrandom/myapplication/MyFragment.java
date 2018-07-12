package com.example.lrandom.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MyFragment extends Fragment {
    MyListener myListener;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        myListener=(MyListener)context;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        myListener.onChange(10);
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
