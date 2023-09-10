public class Rollno_dept {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        check(n);
    }
    static void check(int n){
        if(num>=1 && num <=100){
            if(num >= && num<=25){
                System.out.println(num+" is Girl and belongs to CSE dept");
            }
            else {
                System.out.println(um+" is Boy and belongs to CSE dept");
            }
        }
        if(num>=65 && num<=100){
            System.out.println(num + " is Girl and belongs to IT dept");
        }
        else{
            System.out.println(num+" is Boy belongs to IT dept");
        }
        else {
            System.out.println(num+" not belongs to pkr college");
        }
    }
}
