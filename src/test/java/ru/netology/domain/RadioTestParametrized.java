package ru.netology.domain;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTestParametrized {
    // Parametrized Tests are used because of the large number of values
    @ParameterizedTest
    @CsvSource(value = {"valid1, 1, 1", "valid0, 0, 0",
            "valid9, 9, 9", "valid8, 8, 8",
            "invalid-1, -1, 9", "invalid10, 10, 0"
    })
    void shouldSetCurrentStation(String testName, int newCurrentStation, int expected) {
        Radio station = new Radio();
        station.setCurrentStation(newCurrentStation);
        int actualNewCurrentStation = station.getCurrentStation();
        assertEquals(expected, actualNewCurrentStation);
    }

    @ParameterizedTest
    @CsvSource(value = {"valid1, 1, 2", "valid0, 0, 1",
            "valid9, 9, 0", "valid8, 8, 9",
            "invalid-1, -1, 0", "invalid10, 10, 1"
    })
    void shouldSwitchStationUp(String testName, int currentStation, int expected) {
        Radio station = new Radio();
        station.setCurrentStation(currentStation);
        station.switchCurrentStationUp();
        int actualOneStationUp = station.getCurrentStation();
        assertEquals(expected, actualOneStationUp);
    }

    @ParameterizedTest
    @CsvSource(value = {"valid1, 1, 0", "valid0, 0, 9",
            "valid9, 9, 8", "valid8, 8, 7",
            "invalid-1, -1, 8", "invalid10, 10, 9"
    })
    void switchCurrentStationDown(String testName, int currentStation, int expected) {
        Radio station = new Radio();
        station.setCurrentStation(currentStation);
        station.switchCurrentStationDown();
        int actualOneStationDown = station.getCurrentStation();
        assertEquals(expected, actualOneStationDown);
    }

    @ParameterizedTest
    @CsvSource(value = {"volumeUpValid1, 1, 2", "valid0, 0, 1",
            "valid9, 9, 10", "valid10, 10, 10",
            "invalid-1, -1, 1", "invalid11, 11, 10"
    })
    void shouldIncreaseVolume(String testName, int currentVolume, int expected) {
        Radio volume = new Radio();
        volume.setCurrentVolume(currentVolume);
        volume.increaseVolume();
        int actualIncreasedVolume = volume.getCurrentVolume();
        assertEquals(expected, actualIncreasedVolume);
    }

    @ParameterizedTest
    @CsvSource(value = {"volumeDownValid1, 1, 0", "valid0, 0, 0",
            "valid9, 9, 8", "valid10, 10, 9",
            "invalid-1, -1, 0", "invalid11, 11, 9"
    })
    void decreaseVolume(String testName, int currentVolume, int expected) {
        Radio volume = new Radio();
        volume.setCurrentVolume(currentVolume);
        volume.decreaseVolume();
        int actualDecreasedVolume = volume.getCurrentVolume();
        assertEquals(expected, actualDecreasedVolume);
    }

    @ParameterizedTest
    @CsvSource(value = {"volumeSetValid1, 1, 1", "valid0, 0, 0",
            "valid9, 9, 9", "valid10, 10, 10",
            "invalid-1, -1, 0", "invalid11, 11, 10"
    })
    void shouldSetCurrentVolume(String testName, int currentVolume, int expected) {
        Radio volume = new Radio();
        volume.setCurrentVolume(currentVolume);
        int actualCurrentVolume = volume.getCurrentVolume();
        assertEquals(expected, actualCurrentVolume);
    }
}