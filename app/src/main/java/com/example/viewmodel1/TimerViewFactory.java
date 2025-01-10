package com.example.viewmodel1;

import android.content.Context;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;


public class TimerViewFactory implements ViewModelProvider.Factory {
    private final Context context;

    public TimerViewFactory(Context context) {
        this.context = context.getApplicationContext();
    }


    @Override
    public <T extends ViewModel> T create(Class<T> modelClass) {
        return (T) new TimerViewModel(context);
    }
}


