package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxNumberStation = 9;
    private int minNumberStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio() {
    }
    public Radio(int maxNumberStation) {
        this.maxNumberStation = maxNumberStation - 1;
    }
    public int getMaxNumberStation() {
        return maxNumberStation;
    }


    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setNumberStation(int currentStation) {
        if (currentStation > maxNumberStation) {
            return;
        }
        if (currentStation < minNumberStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setNextStation() {
        if (currentStation == maxNumberStation) {
            this.currentStation = minNumberStation;
        }
        else {
            this.currentStation = currentStation + 1;
        }
    }

    public void setPrevStation() {
        if (currentStation == minNumberStation) {
            this.currentStation = maxNumberStation;
        }
        else {
            this.currentStation = currentStation - 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume == maxVolume) {
            this.currentVolume = currentVolume;
        }
        else {
            this.currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume == minVolume) {
            this.currentVolume = currentVolume;
        }
        else {
            this.currentVolume = currentVolume - 1;
        }
    }
}