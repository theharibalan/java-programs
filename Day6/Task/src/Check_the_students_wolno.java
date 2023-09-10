public class Check_the_students_wolno {
    public static void main(String[] args) {
        check(23);
        check(43);
        check(53);
    }

    static void check(int num) {
        if (num >= 1 && num <= 100) {
            if (num <= 64) {
                System.out.println(num + " Belongs to CSE department");
                if (num >= 1 && num <= 25) {
                    System.out.println("Girl");
                } else {
                    System.out.println("Boy");
                }
            } else {
                System.out.println(num + " Belongs to IT department");
                if (num >= 65) {
                }
            }
        }
    }
}