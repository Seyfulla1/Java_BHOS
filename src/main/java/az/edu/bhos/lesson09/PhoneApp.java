package az.edu.bhos.lesson09;

public class PhoneApp {
    public static void main(String[] args) {
        Apple iphone16 = new Apple("iPhone", "16 Pro", "Titanium", 512, 1299.0);
        Apple iphone14= new Apple("iPhone", "14 Pro Max", "Deep Purple", 256, 1099.99);
        Xiaomi xiaomi_11 = new Xiaomi("Mi", "11", "Blue", 256, 799.99);
        Samsung samsung_s21 = new Samsung("Galaxy", "S21", "White", 128, 899.99);
        Samsung samsung_s24 = new Samsung("Galaxy", "S24 Ultra", "Black", 256, 1250.5);

        System.out.println(iphone16.getModel()+" "+iphone16.getSeries());
        iphone16.ringTone();

        System.out.println(iphone14.getModel()+" "+iphone14.getSeries());
        iphone14.ringTone();

        System.out.println(xiaomi_11.getModel()+" "+xiaomi_11.getSeries());
        xiaomi_11.ringTone();

        System.out.println(samsung_s21.getModel()+" "+samsung_s21.getSeries());
        samsung_s21.ringTone();

        System.out.println(samsung_s24.getModel()+" "+samsung_s24.getSeries());
        samsung_s24.ringTone();

        System.out.println("-----------------------------------------");
        iphone16.addStorage(512);
        iphone16.addStorage(512);
        xiaomi_11.addStorage(2048);

    }
}
