package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

// the setter setMaxStationNumber and the getter are under test
    @Test
    void shouldSetCurrentStationToZero() {
        Radio station = new Radio();
        station.setMaxStationNumber(9);
        int highestNumber = station.getStationsMaxNumber();
        station.setCurrentStation(highestNumber + 1);
        int expected = 0;
        int actualNewCurrentStation = station.getCurrentStation();
        assertEquals(expected, actualNewCurrentStation);
    }

// testing the constructor with one arg Radio(int maxStationNumber)
    @Test
    void shouldSetCurrentStationToMaxIndex() {
        Radio station = new Radio(20);
        station.setCurrentStation(-1);
        int expected = 19;
        int actualNewCurrentStation = station.getCurrentStation();
        assertEquals(expected, actualNewCurrentStation);
    }

    @Test
    void switchCurrentStationUpInvalid() {
        Radio station = new Radio();
        station.setCurrentStation(10);
        station.switchCurrentStationUp();
        int actualNextStation = station.getCurrentStation();
        int expected = 1;
        assertEquals(expected, actualNextStation);

    }

    @Test
    void switchCurrentStationUpValid() {
        Radio station = new Radio();
        station.setCurrentStation(9);
        station.switchCurrentStationUp();
        int actualNextStation = station.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actualNextStation);

    }

    @Test
    void switchCurrentStationDownInvalid() {
        Radio station = new Radio();
        station.setCurrentStation(-1);
        station.switchCurrentStationDown();
        int actualPreviousStation = station.getCurrentStation();
        int expected = 8;
        assertEquals(expected, actualPreviousStation);
    }

    @Test
    void switchCurrentStationDownValid() {
        Radio station = new Radio();
        station.setCurrentStation(0);
        station.switchCurrentStationDown();
        int actualPreviousStation = station.getCurrentStation();
        int expected = 9;
        assertEquals(expected, actualPreviousStation);
    }

    @Test
    void increaseVolumeInvalid() {
        Radio station = new Radio();
        station.setCurrentVolume(110);
        station.increaseVolume();
        int actualIncreasedVolume = station.getCurrentVolume();
        int expected = 100;
        assertEquals(expected, actualIncreasedVolume);
    }

    @Test
    void increaseVolumeValid() {
        Radio station = new Radio();
        station.setCurrentVolume(5);
        station.increaseVolume();
        int actualIncreasedVolume = station.getCurrentVolume();
        int expected = 6;
        assertEquals(expected, actualIncreasedVolume);
    }

    @Test
    void decreaseVolumeInvalid() {
        Radio station = new Radio();
        station.setCurrentVolume(-1);
        station.decreaseVolume();
        int actualDecreasedVolume = station.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actualDecreasedVolume);
    }

    @Test
    void decreaseVolumeValid() {
        Radio station = new Radio();
        station.setCurrentVolume(2);
        station.decreaseVolume();
        int actualDecreasedVolume = station.getCurrentVolume();
        int expected = 1;
        assertEquals(expected, actualDecreasedVolume);
    }
}