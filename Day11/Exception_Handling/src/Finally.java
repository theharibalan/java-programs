public class Finally {
    public static void main(String[] args) {
        try{
            int a = 100 / 0;
            System.out.println(a);
        }
        catch (ArithmeticException e){
            System.out.println("Block 1:: "+e);
        }
        finally {
            System.out.println("Whatever happen i'll run always");
        }
    }
}

