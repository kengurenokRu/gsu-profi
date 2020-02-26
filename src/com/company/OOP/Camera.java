package com.company.OOP;

public class Camera extends phototechnique {
    private String typeCamera;
    private String sizeMatrix;
    private String typeMatrix;
    double countMatrixPoint;

    Camera()
    {
        this.countMatrixPoint = 14.2;
        this.sizeMatrix = "1.5 crop";
        this.typeMatrix = "CMOS";
        this.typeCamera = "Зеркальная";
        setModel("D3100");
        setReleaseYear(2010);
    }

    Camera (String typeCamera,String sizeMatrix, String typeMatrix, double countMatrixPoint, String model, int releaseYear)
    {
        this.countMatrixPoint = countMatrixPoint;
        this.sizeMatrix = sizeMatrix;
        this.typeMatrix = typeMatrix;
        this.typeCamera = typeCamera;
        setModel(model);
        setReleaseYear(releaseYear);

    }

    public double getCountMatrixPoint() {
        return countMatrixPoint;
    }

    public void setCountMatrixPoint(double countMatrixPoint) {
        this.countMatrixPoint = countMatrixPoint;
    }

    public String getSizeMatrix() {
        return sizeMatrix;
    }

    public void setSizeMatrix(String sizeMatrix) {
        this.sizeMatrix = sizeMatrix;
    }

    public String getTypeMatrix() {
        return typeMatrix;
    }

    public void setTypeMatrix(String typeMatrix) {
        this.typeMatrix = typeMatrix;
    }

    public String getTypeCamera() {
        return typeCamera;
    }

    public void setTypeCamera(String typeCamera) {
        this.typeCamera = typeCamera;
    }


}
