package com.frunaos.appaustral.ui.Localidades;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ChamizaViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private MutableLiveData<String> mText;

    public ChamizaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Chamiza");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
