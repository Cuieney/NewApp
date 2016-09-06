package com.android.plugin.entity.response;

import java.util.List;

/**
 * Created by cuieney on 16/5/10.
 */
public class PlayRadioListEntity {

    /**
     * coverImageUrl : http://p4.music.126.net/Z37u6WsXp6kyGv1EGU1lpw==/5750445813394284.jpg
     * createdBy : 55d30caaafd606b60688fa3d
     * description :
     * expiredOn : 2016-05-10T08:32:15.758Z
     * name : 140bpm韩语歌单
     * songs : [{"artistName":"San E","backup_coverImageUrl":"http://mp3.paohaile.com/mp3_imgs/31545817.jpg","backup_mp3Url":"http://mp3.paohaile.com/songs/31545817.mp3","coverImageUrl":"http://p3.music.126.net/FgnO6nRZGhuzk1LhIGrdxQ==/2887317535211431.jpg","duration":217.39211,"fadeIn":3,"fadeOut":202.39211,"mp3Url":"http://m1.music.126.net/dHUdPD2S0cRQeUH-oOIqHg==/2897213139853639.mp3","name":"She's","popularity":5,"runability":0.756786305526,"songId":"55efa63f208d8b1d244cd0fc","tempo":146.052},{"artistName":"SHINee","backup_coverImageUrl":"http://mp3.paohaile.com/mp3_imgs/28059227.jpg","backup_mp3Url":"http://mp3.paohaile.com/songs/28059227.mp3","coverImageUrl":"http://p4.music.126.net/Z37u6WsXp6kyGv1EGU1lpw==/5750445813394284.jpg","duration":213.38667,"fadeIn":3,"fadeOut":198.38667,"mp3Url":"http://m1.music.126.net/T-PAMiA8bk_JvJB2JnJTKQ==/5763639952880144.mp3","name":"3 2 1","popularity":55,"runability":0.785226685376,"songId":"55ee8de6208d8b261c678f4a","tempo":147.976}]
     * tempoRange : {"max":148,"min":142}
     * type : radio
     */

    private String coverImageUrl;
    private String createdBy;
    private String description;
    private String expiredOn;
    private String name;
    /**
     * max : 148
     * min : 142
     */

    private TempoRangeBean tempoRange;
    private String type;
    /**
     * artistName : San E
     * backup_coverImageUrl : http://mp3.paohaile.com/mp3_imgs/31545817.jpg
     * backup_mp3Url : http://mp3.paohaile.com/songs/31545817.mp3
     * coverImageUrl : http://p3.music.126.net/FgnO6nRZGhuzk1LhIGrdxQ==/2887317535211431.jpg
     * duration : 217.39211
     * fadeIn : 3
     * fadeOut : 202.39211
     * mp3Url : http://m1.music.126.net/dHUdPD2S0cRQeUH-oOIqHg==/2897213139853639.mp3
     * name : She's
     * popularity : 5
     * runability : 0.756786305526
     * songId : 55efa63f208d8b1d244cd0fc
     * tempo : 146.052
     */

    private List<SongsBean> songs;

    public String getCoverImageUrl() {
        return coverImageUrl;
    }

    public void setCoverImageUrl(String coverImageUrl) {
        this.coverImageUrl = coverImageUrl;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExpiredOn() {
        return expiredOn;
    }

    public void setExpiredOn(String expiredOn) {
        this.expiredOn = expiredOn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TempoRangeBean getTempoRange() {
        return tempoRange;
    }

    public void setTempoRange(TempoRangeBean tempoRange) {
        this.tempoRange = tempoRange;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<SongsBean> getSongs() {
        return songs;
    }

    public void setSongs(List<SongsBean> songs) {
        this.songs = songs;
    }

    public static class TempoRangeBean {
        private int max;
        private int min;

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }
    }

    public static class SongsBean {
        private String artistName;
        private String backup_coverImageUrl;
        private String backup_mp3Url;
        private String coverImageUrl;
        private double duration;
        private int fadeIn;
        private double fadeOut;
        private String mp3Url;
        private String name;
        private int popularity;
        private double runability;
        private String songId;
        private double tempo;

        @Override
        public String toString() {
            return "SongsBean{" +
                    "artistName='" + artistName + '\'' +
                    ", backup_coverImageUrl='" + backup_coverImageUrl + '\'' +
                    ", backup_mp3Url='" + backup_mp3Url + '\'' +
                    ", coverImageUrl='" + coverImageUrl + '\'' +
                    ", duration=" + duration +
                    ", fadeIn=" + fadeIn +
                    ", fadeOut=" + fadeOut +
                    ", mp3Url='" + mp3Url + '\'' +
                    ", name='" + name + '\'' +
                    ", popularity=" + popularity +
                    ", runability=" + runability +
                    ", songId='" + songId + '\'' +
                    ", tempo=" + tempo +
                    '}';
        }

        public String getArtistName() {
            return artistName;
        }

        public void setArtistName(String artistName) {
            this.artistName = artistName;
        }

        public String getBackup_coverImageUrl() {
            return backup_coverImageUrl;
        }

        public void setBackup_coverImageUrl(String backup_coverImageUrl) {
            this.backup_coverImageUrl = backup_coverImageUrl;
        }

        public String getBackup_mp3Url() {
            return backup_mp3Url;
        }

        public void setBackup_mp3Url(String backup_mp3Url) {
            this.backup_mp3Url = backup_mp3Url;
        }

        public String getCoverImageUrl() {
            return coverImageUrl;
        }

        public void setCoverImageUrl(String coverImageUrl) {
            this.coverImageUrl = coverImageUrl;
        }

        public double getDuration() {
            return duration;
        }

        public void setDuration(double duration) {
            this.duration = duration;
        }

        public int getFadeIn() {
            return fadeIn;
        }

        public void setFadeIn(int fadeIn) {
            this.fadeIn = fadeIn;
        }

        public double getFadeOut() {
            return fadeOut;
        }

        public void setFadeOut(double fadeOut) {
            this.fadeOut = fadeOut;
        }

        public String getMp3Url() {
            return mp3Url;
        }

        public void setMp3Url(String mp3Url) {
            this.mp3Url = mp3Url;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPopularity() {
            return popularity;
        }

        public void setPopularity(int popularity) {
            this.popularity = popularity;
        }

        public double getRunability() {
            return runability;
        }

        public void setRunability(double runability) {
            this.runability = runability;
        }

        public String getSongId() {
            return songId;
        }

        public void setSongId(String songId) {
            this.songId = songId;
        }

        public double getTempo() {
            return tempo;
        }

        public void setTempo(double tempo) {
            this.tempo = tempo;
        }
    }
}
