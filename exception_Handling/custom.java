public class custom {
    public static void main(String[] args) {
        try {
            checkAge(19);
        } catch (AgeInvalidException e) {
            System.out.println(e.getMessage());
        }
    }

    static void checkAge(int age) throws AgeInvalidException {
        if(age < 18){
            throw new AgeInvalidException("age must be >= 18");
        }
        else{
            System.out.println("Allowed");
        }
    }
}

class AgeInvalidException extends Exception{
    AgeInvalidException (String msg){
        super(msg);
    }
}
