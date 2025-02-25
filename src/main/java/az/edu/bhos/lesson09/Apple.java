package az.edu.bhos.lesson09;

public class Apple extends Phone{

    public Apple(String model, String series, String color, int storage, double price) {
        super(model, series, color, storage, price);
    }

    public void CallWithFaceTime() {
        System.out.println("Calling with FaceTime....");
    }
    @Override
    public void ringTone() {
        System.out.println("ring ring ring");
    }
    @Override
    public void addStorage(int extraStorage) {
        if(getStorage()+extraStorage>1024)
        {
            System.out.println("You can't add more than 1024 GB of storage to your "+getModel()+" "+getSeries());
        }
        else
        {
            super.addStorage(extraStorage);
        }
    }

}
