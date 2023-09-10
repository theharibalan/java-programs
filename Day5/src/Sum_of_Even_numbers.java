public class Sum_of_Even_numbers {
    int num, sum = 0;
    public void sumEven(int x){
        num  = x;
        for (int i = num; i >=1; i-=2) {
            sum+=i;
        }
        System.out.println("Sum is "+sum);
    }

    public static void main(String[] args) {
        Sum_of_Even_numbers s = new Sum_of_Even_numbers();
        s.sumEven(10);
    }
}
