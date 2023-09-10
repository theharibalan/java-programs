public class Sum_of_phone_numbers {
    public static void main(String[] args) {
        long number = 9345368392L;
        System.out.println(Sum(number));
    }
static long Sum(long num){
        int rem = 0;
        long sum = 0;
    for (long i = num; i > 0; i=i/10) {
        rem = (int) (i % 10);
        sum +=rem;
    }
    return sum;
}

}
