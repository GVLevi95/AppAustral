package com.frunaos.appaustral.ui.Localidades;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MetriViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private MutableLiveData<String> mText;

    public MetriViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Metri");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
