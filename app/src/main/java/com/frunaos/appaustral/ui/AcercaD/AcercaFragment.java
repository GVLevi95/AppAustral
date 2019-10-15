package com.frunaos.appaustral.ui.AcercaD;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.frunaos.appaustral.R;

public class AcercaFragment extends Fragment {

    private AcercaViewModel mViewModel;

    public static AcercaFragment newInstance() {
        return new AcercaFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.acerca_fragment, container, false);
    }



}
