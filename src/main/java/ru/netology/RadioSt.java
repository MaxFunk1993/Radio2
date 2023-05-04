package ru.netology;

public class RadioSt {
    public int currentStation;


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            newCurrentStation = 9;
        }
        if (newCurrentStation > 9) {
            newCurrentStation = 0;
        }
        currentStation = newCurrentStation;
    }

    public void setToMaxStation() {
        currentStation = 9;
    }

    public void setToMinStation() {
        currentStation = 0;
    }

    public void increaseStation() {
        if (currentStation == 9) {
            setCurrentStation(0);
        } else {
            currentStation++;

        }
    }

    public void reductionStation() {
        if (currentStation == 0) {
            setCurrentStation(9);
        } else {
            currentStation--;

        }
    }
}
