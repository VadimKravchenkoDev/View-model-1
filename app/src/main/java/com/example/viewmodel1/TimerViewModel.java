package com.example.viewmodel1;

import android.os.CountDownTimer;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.sql.Time;

public class TimerViewModel extends ViewModel {
    private CountDownTimer timer;
    private final MutableLiveData<String> TimerLiveData = new MutableLiveData<>();

    public LiveData<String> getLiveData() {
        return TimerLiveData;
    }

    public void startTimer() {
       if(TimerLiveData.getValue()==null){
            timer = new CountDownTimer(10000, 1000) {
                @Override
                public void onTick(long millisUntilFinished) {
                    TimerLiveData.setValue(millisUntilFinished/1000+ " sec");
                }
                @Override
                public void onFinish() {
                    TimerLiveData.setValue("Timer's up");
                }
            };
            timer.start();
       }
    }
}