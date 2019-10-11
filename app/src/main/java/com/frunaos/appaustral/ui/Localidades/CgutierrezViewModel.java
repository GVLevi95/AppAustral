package com.frunaos.appaustral.ui.Localidades;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CgutierrezViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private MutableLiveData<String> mText;

    public CgutierrezViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Caleta Gutierrez");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
