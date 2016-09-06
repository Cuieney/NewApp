package com.android.plugin.entity.response;

/**
 * Created by cuieney on 16/4/27.
 */
public class RadiosListEntity {

    /**
     * radioKey : all_2
     * name : 电子音乐电台
     * coverImageUrl : https://s3.cn-north-1.amazonaws.com.cn/mp3.paohaile.com/radioCover/all_2_3x.jpg
     * numPlayed : 4693
     */

    private String radioKey;
    private String name;
    private String coverImageUrl;
    private int numPlayed;

    @Override
    public String toString() {
        return "RadiosListEntity{" +
                "radioKey='" + radioKey + '\'' +
                ", name='" + name + '\'' +
                ", coverImageUrl='" + coverImageUrl + '\'' +
                ", numPlayed=" + numPlayed +
                '}';
    }

    public String getRadioKey() {
        return radioKey;
    }

    public void setRadioKey(String radioKey) {
        this.radioKey = radioKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoverImageUrl() {
        return coverImageUrl;
    }

    public void setCoverImageUrl(String coverImageUrl) {
        this.coverImageUrl = coverImageUrl;
    }

    public int getNumPlayed() {
        return numPlayed;
    }

    public void setNumPlayed(int numPlayed) {
        this.numPlayed = numPlayed;
    }
}
