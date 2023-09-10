public class Inside_Method {
    static void disp(int age){
        if(age>=18){
            throw new ArithmeticException("Fit for vote");
        }
        else {
            System.out.println("Not fit");
        }
    }

    public static void main(String[] args) {
        disp(34);
        disp(17);
    }
}
