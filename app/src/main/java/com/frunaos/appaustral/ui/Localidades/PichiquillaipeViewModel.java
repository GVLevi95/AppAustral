package com.frunaos.appaustral.ui.Localidades;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PichiquillaipeViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private MutableLiveData<String> mText;

    public PichiquillaipeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Pichiquillaipe");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
