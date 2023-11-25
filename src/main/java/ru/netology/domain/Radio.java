package ru.netology.domain;

public class Radio {
    private int currentStation = 0;
    private int currentVolume = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int radioStationsCount = 10;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;

    public Radio() {}

    public Radio(int radioStationsCount) {
        if (radioStationsCount > 0) {
            this.radioStationsCount = radioStationsCount;
            this.maxRadioStation = radioStationsCount - 1;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxRadioStation) {
            return;
        }
        if (currentStation < minRadioStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getRadioStationsCount() {
        return radioStationsCount;
    }

    public void nextStation() {
        if (currentStation < maxRadioStation) {
            currentStation++;
        } else {
            currentStation = minRadioStation;
        }
    }

    public void prevStation() {
        if (currentStation > minRadioStation) {
            currentStation--;
        } else {
            currentStation = maxRadioStation;
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }
}