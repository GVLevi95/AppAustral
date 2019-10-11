package com.frunaos.appaustral.ui.AcercaD;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AcercaViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private MutableLiveData<String> mText;

    public AcercaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Acerca de ");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
