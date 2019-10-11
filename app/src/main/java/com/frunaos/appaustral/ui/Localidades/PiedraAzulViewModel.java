package com.frunaos.appaustral.ui.Localidades;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PiedraAzulViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private MutableLiveData<String> mText;

    public PiedraAzulViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Piedra Azul");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
