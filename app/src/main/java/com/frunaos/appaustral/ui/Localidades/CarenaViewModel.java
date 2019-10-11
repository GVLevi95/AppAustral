package com.frunaos.appaustral.ui.Localidades;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CarenaViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private MutableLiveData<String> mText;

    public CarenaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Caleta la Arena");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
