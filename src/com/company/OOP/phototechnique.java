package com.company.OOP;

public abstract class phototechnique {
    private String model;
   /* private enum manufacturer {
        Китай,
        Тайвань,
        Япония,
        США,
        Россия;
    };*/
    private int releaseYear;

    phototechnique()
    {
        this.model = "Nikon";
        this.releaseYear = 2020;
    }
    phototechnique(String model, int releaseYear)
    {
        this.model = model;
        this.releaseYear = releaseYear;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}
