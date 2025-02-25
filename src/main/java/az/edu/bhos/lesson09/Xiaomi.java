package az.edu.bhos.lesson09;

public class Xiaomi extends Phone{

    public Xiaomi(String model, String series, String color, int storage, double price) {
        this.model = model;
        this.series = series;
        this.color = color;
        this.storage = storage;
        this.price = price;
    }
    @Override
    public void ringTone() {
        System.out.println("ding ding ding");
    }
}
