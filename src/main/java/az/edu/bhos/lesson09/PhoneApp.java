package az.edu.bhos.lesson09;

public class PhoneApp {
    public static void main(String[] args) {
        Apple iphone16 = new Apple("iPhone", "16 Pro", "Titanium", 512, 1299.0);
        Xiaomi xiaomi_11 = new Xiaomi("Mi", "11", "Blue", 256, 799.99);
        Samsung samsung_s21 = new Samsung("Galaxy", "S21", "White", 128, 899.99);

        iphone16.printModel();
        iphone16.ringTone();

        xiaomi_11.printModel();
        xiaomi_11.ringTone();

        samsung_s21.printModel();
        samsung_s21.ringTone();


    }
}
