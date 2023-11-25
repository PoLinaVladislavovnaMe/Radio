package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {
    @Test
    public void checkSetStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);

        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkSetStationMoreMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(12);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkSetStationLessMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-6);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.nextStation();

        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkNextStationAfterMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.prevStation();

        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkPrevStationLessMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkSetVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(45);

        int expected = 45;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkSetVolumeMoreMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(111);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkSetVolumeLessMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-5);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(44);
        radio.increaseVolume();

        int expected = 45;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkIncreaseVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(66);
        radio.decreaseVolume();

        int expected = 65;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkDecreaseVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkSetOtherStationsCount() {
        Radio radio = new Radio(60);

        int expected = 60;
        int actual = radio.getRadioStationsCount();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkIncorrectRadioStationsCount() {
        Radio radio = new Radio(-5);

        int expected = 10;
        int actual = radio.getRadioStationsCount();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkNextStationMoreDefaultMaxWithOtherStationsCount() {
        Radio radio = new Radio(60);
        radio.setCurrentStation(9);
        radio.nextStation();

        int expected = 10;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkPrevStationLessMinWithOtherStationsCount() {
        Radio radio = new Radio(60);
        radio.setCurrentStation(0);
        radio.prevStation();

        int expected = 59;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
}