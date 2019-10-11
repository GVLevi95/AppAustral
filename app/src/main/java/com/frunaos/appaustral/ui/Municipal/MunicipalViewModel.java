package com.frunaos.AppAustral.ui.Municipal;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MunicipalViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MunicipalViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Informacion de la municipalidad");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
