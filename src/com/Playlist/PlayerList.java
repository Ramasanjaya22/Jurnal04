package com.Playlist;

public class PlayerList {
    private String judulLagu;
    private String singer;

    public PlayerList(String judulLagu, String singer){
        this.judulLagu = judulLagu;
        this.singer = singer;
    }
    public String getJudulLagu(){
        return this.judulLagu;
    };

    @Override
    public String toString(){
        return this.judulLagu;
    }
}
