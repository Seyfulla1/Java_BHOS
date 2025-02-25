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
    public String getModel() {
        return model;
    }
    public String getSeries() {
        return series;
    }
    public String getColor() {
        return color;
    }
    public int getStorage() {
        return storage;
    }
    public double getPrice() {
        return price;
    }
    public void addStorage(int extraStorage) {
        this.storage += extraStorage;
        System.out.println("Storage added successfully to your "+model+" "+series+". New storage is: "+storage);
    }


    public abstract void ringTone();






}
