package az.edu.bhos.lesson09;

public abstract class Phone {
    public String model;
    public String series;
    public String color;
    public int storage;
    public double price;

    public void printModel() {
        System.out.println("Model: " + model);
    }

    public abstract void ringTone();






}
