package com.android.plugin.entity.request;

/**
 * Created by cuieney on 16/5/10.
 */
public class PlayRadioReq {

    /**
     * radioKey : korea_1
     * tempo : 140
     * isFirstTime : true
     */

    private String radioKey;
    private int tempo;
    private boolean isFirstTime;

    public PlayRadioReq(String radioKey, int tempo, boolean isFirstTime) {
        this.radioKey = radioKey;
        this.tempo = tempo;
        this.isFirstTime = isFirstTime;
    }

    public String getRadioKey() {
        return radioKey;
    }

    public void setRadioKey(String radioKey) {
        this.radioKey = radioKey;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public boolean isIsFirstTime() {
        return isFirstTime;
    }

    public void setIsFirstTime(boolean isFirstTime) {
        this.isFirstTime = isFirstTime;
    }
}
