package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioStTest {
    @Test
    public void shouleSetStation() {
        RadioSt radioSt = new RadioSt();

        radioSt.setCurrentStation(9);

        int expected = 9;
        int actual = radioSt.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleSetStationZ() {
        RadioSt radioSt = new RadioSt();

        radioSt.setCurrentStation(11);

        int expected = 0;
        int actual = radioSt.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouleSetStationX() {
        RadioSt radioSt = new RadioSt();

        radioSt.setCurrentStation(-1);

        int expected = 9;
        int actual = radioSt.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shuldSetToMaxStation() {
        RadioSt radioSt = new RadioSt();

        radioSt.setToMaxStation();

        int expected = 9;
        int actual = radioSt.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shuldSetToMinStation() {
        RadioSt radioSt = new RadioSt();

        radioSt.setToMinStation();

        int expected = 0;
        int actual = radioSt.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseStation() {
        RadioSt radioSt = new RadioSt();
        radioSt.setCurrentStation(7);
        radioSt.increaseStation();

        int expected = 8;
        int actual = radioSt.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseStationN() {
        RadioSt radioSt = new RadioSt();
        radioSt.setCurrentStation(9);
        radioSt.increaseStation();

        int expected = 0;
        int actual = radioSt.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reductionStation() {
        RadioSt radioSt = new RadioSt();
        radioSt.setCurrentStation(8);
        radioSt.reductionStation();

        int expected = 7;
        int actual = radioSt.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reductionStationN() {
        RadioSt radioSt = new RadioSt();
        radioSt.setCurrentStation(0);
        radioSt.reductionStation();

        int expected = 9;
        int actual = radioSt.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
}
