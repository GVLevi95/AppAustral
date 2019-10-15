package com.frunaos.appaustral.ui.Localidades;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PellucoViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private MutableLiveData<String> mText;

    public PellucoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Pelluco");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
