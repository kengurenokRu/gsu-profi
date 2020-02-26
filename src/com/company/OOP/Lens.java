package com.company.OOP;

import javax.swing.filechooser.FileNameExtensionFilter;

public class Lens extends phototechnique {
    private String bayonet;  //тип байонета
    /*private enum autofokcus { //наличие автофокуса
        да,
        нет;
    };*/
    private double minimalFocalLength; //минимальное фокусное расстояние
    private double apeture; //светосила объектива
    private int minimalDiafragm; //минимальное значние диафрагмы

    Lens() {
        this.bayonet = "Nikon F";
        this.minimalFocalLength = 1.1;
        this.minimalDiafragm = 32;
        this.apeture = 4.5;
        setModel("AF-P DX Nikkor 70-300 f/4.5-6.3G ED VR");
        setReleaseYear(2018);
    }

    Lens(String bayonet, double minimalFocalLength, int minimalDiafragm, double apeture, String model, int releaseYear) {
        this.bayonet = bayonet;
        this.minimalFocalLength = minimalFocalLength;
        this.minimalDiafragm = minimalDiafragm;
        this.apeture = apeture;
        setModel(model);
        setReleaseYear(releaseYear);
    }

    public String getBayonet() {
        return bayonet;
    }

    public void setBayonet(String bayonet) {
        this.bayonet = bayonet;
    }

    public double getMinimalFocalLength() {
        return minimalFocalLength;
    }

    public void setMinimalFocalLength(double minimalFocalLength) {
        this.minimalFocalLength = minimalFocalLength;
    }

    public int getMinimalDiafragm() {
        return minimalDiafragm;
    }

    public void setMinimalDiafragm(int minimalDiafragm) {
        this.minimalDiafragm = minimalDiafragm;
    }

    public double getApeture() {
        return apeture;
    }

    public void setApeture(double apeture) {
        this.apeture = apeture;
    }
}
