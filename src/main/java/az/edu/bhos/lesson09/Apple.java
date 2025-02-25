package az.edu.bhos.lesson09;

public class Apple extends Phone{

    public Apple(String model, String series, String color, int storage, double price) {
        super(model, series, color, storage, price);
    }
    @Override
    public void ringTone() {
        System.out.println("ring ring ring");
    }

}
