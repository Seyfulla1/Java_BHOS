package az.edu.bhos.lesson09;

public class PhoneApp {
    public static void main(String[] args) {
        Apple iphone16 = new Apple("iPhone", "16 Pro", "Titanium", 512, 1299.0);
        Apple iphone14= new Apple("iPhone", "14 Pro Max", "Deep Purple", 256, 1099.99);
        Xiaomi xiaomi_11 = new Xiaomi("Mi", "11", "Blue", 256, 799.99);
        Samsung samsung_s21 = new Samsung("Galaxy", "S21", "White", 128, 899.99);
        Samsung samsung_s24 = new Samsung("Galaxy", "S24 Ultra", "Black", 256, 1250.5);

        iphone16.printModel();
        iphone16.ringTone();

        iphone14.printModel();
        iphone14.ringTone();

        xiaomi_11.printModel();
        xiaomi_11.ringTone();

        samsung_s21.printModel();
        samsung_s21.ringTone();

        samsung_s24.printModel();
        samsung_s24.ringTone();


    }
}
