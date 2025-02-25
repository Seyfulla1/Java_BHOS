package az.edu.bhos.lesson09;

public abstract class Phone {
    private String model;
    private String series;
    private String color;
    private int storage;
    private double price;

    public Phone(String model, String series, String color, int storage, double price) {
        this.model = model;
        this.series = series;
        this.color = color;
        this.storage = storage;
        this.price = price;
    }
    public void getModel() {
        System.out.println("Model: " + model);
    }
    public void getSeries() {
        System.out.println("Series: " + series);
    }
    public void getColor() {
        System.out.println("Color: " + color);
    }
    public void getStorage() {
        System.out.println("Storage: " + storage);
    }
    public void getPrice() {
        System.out.println("Price: " + price);
    }


    public abstract void ringTone();






}
