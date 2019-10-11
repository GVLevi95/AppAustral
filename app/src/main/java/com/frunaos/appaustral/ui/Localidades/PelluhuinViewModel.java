package com.frunaos.appaustral.ui.Localidades;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PelluhuinViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private MutableLiveData<String> mText;

    public PelluhuinViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Pelluhuin");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
