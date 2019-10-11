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

public class QuillaipeFragment extends Fragment {

    private QuillaipeViewModel mViewModel;

    public static QuillaipeFragment newInstance() {
        return new QuillaipeFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.quillaipe_fragment, container, false);
    }



}
