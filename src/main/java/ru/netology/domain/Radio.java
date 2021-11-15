package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
// I believe there will be no manual input for this value
// (similar to one we have for newCurrentStation),
// but I added these limitations, just for the case
    public void setCurrentVolume(int defaultVolume) {
        currentVolume = defaultVolume;
        if (defaultVolume > 10) {
            currentVolume = 10;
        }
        if (defaultVolume < 0) {
            currentVolume = 0;
        }
    }

    // max == 9 - should it be a var? we do not need two more variables for this specific radio
    public void setCurrentStation(int newCurrentStation) {
        currentStation = newCurrentStation;
        if (newCurrentStation > 9) {
            currentStation = 0;
        }
        if (newCurrentStation < 0) {
            currentStation = 9;
        }
    }

    public void switchCurrentStationUp() {
        if (currentStation < 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void switchCurrentStationDown() {
        if (currentStation > 0) {
            currentStation--;
        } else currentStation = 9;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
