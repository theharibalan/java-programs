public class MethodOverloading_Understanding {
        static int Method1(int a, int b,int c){
            return a+b;
        }

        static String Method1(int a, int b){
            System.out.println(a+b);
            return "success";
        }

        public static void main(String[] args) {
            System.out.println(Method1(2,5,7));
//            System.out.println(Method1(2.3f,5));
        }
}
