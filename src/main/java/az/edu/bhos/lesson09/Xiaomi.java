package az.edu.bhos.lesson09;

public class Xiaomi extends Phone{

    public Xiaomi(String model, String series, String color, int storage, double price) {
        super(model, series, color, storage, price);
    }

    public void fastCharge() {
        System.out.println("Charging 120W and will explode in a few seconds....");
    }
    @Override
    public void ringTone() {
        System.out.println("ding ding ding");
    }
}
