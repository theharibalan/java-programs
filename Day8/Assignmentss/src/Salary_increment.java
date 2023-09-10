public class Salary_increment {
    public static void main(String[] args) {
        main(15000,6);
    }
    static void main(float salary, int years){
        if(years >= 5){
            float bonus = salary*5/100;
            System.out.println("Yur bonus is: "+bonus);
        }
        else{
            System.out.println("Sorry you're not eligible for bonus");
        }
    }
}