import java.util.Scanner;
import java.util.Random;

public class uc { public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            int targetNumber = random.nextInt(10) + 1; //
            int guess = 0;

            System.out.println("1 ile 10 arasında bir sayı tahmin edin.");

            while (guess != targetNumber) {
                System.out.print("Tahmininizi girin: ");
                guess = scanner.nextInt();
                }
            System.out.println("Tebrikler!");
            }
        }
