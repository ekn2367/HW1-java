import java.util.Scanner;
public class dort {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Bir sayı girin: ");
            int number = scanner.nextInt();

            if(isPerfect(number)) {
                System.out.println(number + " mükemmel bir sayıdır.");
            } else {
                System.out.println(number + " mükemmel bir sayı değildir.");
            }
        }
        public static boolean isPerfect(int number) {
            int sum = 0;
            for(int i = 1; i < number; i++) {
                if(number % i == 0) {
                    sum += i;
                }
            }
            return sum == number;
        }
    }