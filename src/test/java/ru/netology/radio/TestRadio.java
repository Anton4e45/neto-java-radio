package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestRadio {
    Radio radio = new Radio();

    @Test
    void SetMaxNumberStationDefault(){
        int actual = radio.getMaxNumberStation();
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void NotSetStationMoreNine() {
        radio.setNumberStation(11);
        int actual = radio.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void NotSetStationLessZero() {
        radio.setNumberStation(-1);
        int actual = radio.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void SetStationNext() {
        Radio radio = new Radio(25);
        radio.setNumberStation(20);
        radio.setNextStation();
        int actual = radio.getCurrentStation();
        int expected = 21;
        assertEquals(expected, actual);
    }

    @Test
    void SetStationPrev() {
        radio.setNumberStation(3);
        radio.setPrevStation();
        int actual = radio.getCurrentStation();
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void SetStationPrevZero() {
        radio.setNumberStation(0);
        radio.setPrevStation();
        int actual = radio.getCurrentStation();
        int expected = radio.getMaxNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    void SetStationNextNine() {
        radio.setNumberStation(radio.getMaxNumberStation());
        radio.setNextStation();
        int actual = radio.getCurrentStation();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void SetVolumeMore() {
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void SetVolumeLess() {
        radio.setCurrentVolume(5);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void SetVolumeNoMore() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    void SetVolumeNoLess() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }
}