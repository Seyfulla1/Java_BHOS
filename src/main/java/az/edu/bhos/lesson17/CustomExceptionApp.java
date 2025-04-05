package az.edu.bhos.lesson17;

public class CustomExceptionApp {
    public static void main(String[] args) throws NotMaleException {
        validateGender("female");

    }
    public static void validateGender(String gender) throws NotMaleException{
        if(!gender.equals("male")){
            throw new NotMaleException("Gender cannot be anything other than male!!");
        }
    }
}
