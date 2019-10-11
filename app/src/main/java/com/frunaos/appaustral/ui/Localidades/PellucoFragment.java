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

public class PellucoFragment extends Fragment {

    private PellucoViewModel mViewModel;

    public static PellucoFragment newInstance() {
        return new PellucoFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.pelluco_fragment, container, false);
    }


}
