package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {

    @Test
    public void radioStationOn() {

        Radio radio = new Radio();
        radio.setCurrentStation(4);

        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {

        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.nextStation();

        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationAfterMax() {

        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void stationMoreMax() {

        Radio radio = new Radio();
        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {

        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.prevStation();

        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationLessMin() {

        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void stationLessMin() {

        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volume() {

        Radio radio = new Radio();
        radio.setCurrentVolume(50);

        int expected = 50;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.increaseVolume();

        int expected = 51;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeLessMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.decreaseVolume();

        int expected = 49;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseMoreVolumeMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
