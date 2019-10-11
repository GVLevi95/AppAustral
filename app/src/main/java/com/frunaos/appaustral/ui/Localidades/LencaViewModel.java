package com.frunaos.appaustral.ui.Localidades;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LencaViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private MutableLiveData<String> mText;

    public LencaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Lenca");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
