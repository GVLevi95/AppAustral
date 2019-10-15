package com.frunaos.appaustral.ui.Localidades;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ChaicasViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private MutableLiveData<String> mText;

    public ChaicasViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Chaicas");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
