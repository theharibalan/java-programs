public class RuntimeExcep extends RuntimeException {
    RuntimeExcep(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {
        System.out.println("Hello");
        throw new RuntimeExcep("Test class object");
    }
}
