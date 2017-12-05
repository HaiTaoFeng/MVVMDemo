package com.demo.tangminglong.mvvmprojecttest.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.demo.tangminglong.mvvmprojecttest.BR;


/**
 * Created by tangminglong on 17/12/5.
 */

public class Setting extends BaseObservable {
    private boolean voiceOn = false;
    private boolean vibrateOn = false;
    private boolean cacheEnable = false;
    private int cacheSize = 0;

    @Override
    public void notifyPropertyChanged(int fieldId) {
        super.notifyPropertyChanged(fieldId);
        if (fieldId != BR.description){
            notifyPropertyChanged(BR.description);
        }
    }

    @Bindable
    public void setCacheEnable(boolean cacheEnable){
        this.cacheEnable = cacheEnable;
        notifyPropertyChanged(BR.cacheEnable);
    }

    @Bindable
    public void setCacheSize(int cacheSize) {
        this.cacheSize = cacheSize;
        notifyPropertyChanged(BR.cacheSize);
    }

    @Bindable
    public void setVibrateOn(boolean vibrateOn) {
        this.vibrateOn = vibrateOn;
        notifyPropertyChanged(BR.vibrateOn);
    }

    @Bindable
    public void setVoiceOn(boolean voiceOn) {
        this.voiceOn = voiceOn;
        notifyPropertyChanged(BR.voiceOn);
    }

    @Bindable
    public int getCacheSize() {
        return cacheSize;
    }

    @Bindable
    public boolean isCacheEnable() {
        return cacheEnable;
    }

    @Bindable
    public boolean isVibrateOn() {
        return vibrateOn;
    }

    @Bindable
    public boolean isVoiceOn() {
        return voiceOn;
    }

    @Bindable
    public String getDescription(){
        return this.toString();
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append(": ");
        stringBuilder.append("\nvibrateOn:");
        stringBuilder.append(vibrateOn);
        stringBuilder.append("\nvoiceOn:");
        stringBuilder.append(voiceOn);
        stringBuilder.append("\ncacheEnable: ");
        stringBuilder.append(cacheEnable);
        if (cacheEnable){
            stringBuilder.append("\ncacheSize: ");
            stringBuilder.append(cacheSize);
        }
        return stringBuilder.toString();
    }
}
