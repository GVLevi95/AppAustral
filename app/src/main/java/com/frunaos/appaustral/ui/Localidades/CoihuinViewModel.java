package com.frunaos.appaustral.ui.Localidades;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CoihuinViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private MutableLiveData<String> mText;

    public CoihuinViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Coihuin");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
