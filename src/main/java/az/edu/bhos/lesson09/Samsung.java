package az.edu.bhos.lesson09;

public class Samsung extends Phone{

    public Samsung(String model, String series, String color, int storage, double price) {
           super(model, series, color, storage, price);
    }
    @Override
    public void ringTone() {
        System.out.println("sam sam sam");
    }
}
