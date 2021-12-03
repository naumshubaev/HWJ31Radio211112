package ru.netology.domain; // upd211203 v2.1

public class Radio {
    private int currentStation = 0;
    private int maxStationNumber = 10;
    private int currentVolume = 40;

    // constructor w/o arguments is needed to use the default values declared above
    public Radio() {

    }

    // autogenerated constructor all arguments -currentStation -currentVolume:
    public Radio(int maxStationNumber) { //(int currentStation, int maxStationNumber, int currentVolume) {
//        this.currentStation = currentStation;
        this.maxStationNumber = maxStationNumber;
//        this.currentVolume = currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getStationsMaxNumber() {
        return maxStationNumber;
    }

    public void setMaxStationNumber(int maxStationNumber) {
        this.maxStationNumber = maxStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    // I believe there will be no manual input for this value
// (similar to one we have for newCurrentStation),
// but I added these limitations, just for the case
    public void setCurrentVolume(int defaultVolume) {
        currentVolume = defaultVolume;
        if (defaultVolume > 100) {
            currentVolume = 100;
        }
        if (defaultVolume < 0) {
            currentVolume = 0;
        }
    }


    public void setCurrentStation(int newCurrentStation) {
        currentStation = newCurrentStation;
        if (newCurrentStation > maxStationNumber - 1) {
            currentStation = 0;
        }
        if (newCurrentStation < 0) {
            currentStation = maxStationNumber - 1;
        }
    }

    public void switchCurrentStationUp() {
        if (currentStation < maxStationNumber - 1) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void switchCurrentStationDown() {
        if (currentStation > 0) {
            currentStation--;
        } else currentStation = maxStationNumber - 1;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
