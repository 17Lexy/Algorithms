import java.util.Scanner;

public class Recursion {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            factorial(x);

        }



        public static int factorial(int x){
            int factorial = 1;

            for (int i = 1; i <= x; i++) {
                factorial *= i;
            }

            return factorial;


        }



        public static int  recursiaFactorial(int y){
            if (y == 0 || y == 1){
                return 1;
            }else {
                return y * recursiaFactorial(y-1);
            }


        }
    }

