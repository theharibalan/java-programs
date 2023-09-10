public class ParseInt_understanding {
    public static void main(String[] args) {
//        int a = Integer.parseInt("150", 8);
//        int b = Integer.parseInt("+200", 16);
//        int c = Integer.parseInt("-344", 12);
//        System.out.println("Value = "+a);
//        System.out.println("Value = "+b);
//        System.out.println("Value = "+c);
        String numberString = "123";
        int number = Integer.parseInt(numberString); // It will convert the stringof integer value into actual Integer value
        System.out.println(number);
        int b = 20;
        System.out.println(number+b);


        // This will throw NumberFormatException
        String invalidString = "abc";
        int num = Integer.parseInt(invalidString);
        System.out.println(num);

        // We can't able to make the character value to string---> char invalidString = 'a';


    }
}
