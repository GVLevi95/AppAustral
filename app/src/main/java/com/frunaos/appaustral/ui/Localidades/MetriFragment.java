package com.frunaos.appaustral.ui.Localidades;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.frunaos.appaustral.R;

public class MetriFragment extends Fragment {

    private MetriViewModel mViewModel;

    public static MetriFragment newInstance() {
        return new MetriFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.metri_fragment, container, false);
    }



}
