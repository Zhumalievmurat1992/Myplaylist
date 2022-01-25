package com.example.myplaylist;

public class Songs {

    private String numbers;
    private String time;
    private String singer;
    private String nameMusic;


    public Songs(String numbers, String time, String singer, String nameMusic) {
        this.numbers = numbers;
        this.time = time;
        this.singer = singer;
        this.nameMusic = nameMusic;
    }

    public String getNumbers() {
        return numbers;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getNameMusic() {
        return nameMusic;
    }

    public void setNameMusic(String nameMusic) {
        this.nameMusic = nameMusic;
    }
}