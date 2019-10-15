package com.frunaos.appaustral.ui.Localidades;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class QuillaipeViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private MutableLiveData<String> mText;

    public QuillaipeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Quillaipe");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
