package ru.netology.domain;

public class Radio {

    private int currentStation;
    private int currentVolume;
    private int MaxVolume = 100;
    private int MinVolume = 0;
    private int MaxRadioStation = 9;
    private int MinRadioStation = 0;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > MaxRadioStation) {
            return;
        }
        if (currentStation < MinRadioStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > MaxVolume) {
            return;
        }
        if (currentVolume < MinVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void nextStation() {
        if (currentStation < MaxRadioStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation > MinRadioStation) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }

    public void increaseVolume() {
        if (currentVolume < MaxVolume) {
            currentVolume++;
        } else {
            currentVolume = 100;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > MinVolume) {
            currentVolume--;
        } else {
            currentVolume = 0;
        }
    }
}
