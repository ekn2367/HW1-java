import java.util.Scanner;
public class alti {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Öğrenci sayısını girin: ");
            int studentCount = scanner.nextInt();

            for (int i = 1; i <= studentCount; i++) {
                System.out.println("\nÖğrenci " + i + " bilgilerini girin:");
                System.out.print("Öğrencinin adı ve soyadı: ");
                String Name = scanner.next();
                System.out.print("1. sınav notu: ");
                double grade1 = scanner.nextDouble();
                System.out.print("2. sınav notu: ");
                double grade2 = scanner.nextDouble();
                System.out.print("3. sınav notu: ");
                double grade3 = scanner.nextDouble();

                double average = (grade1 + grade2 + grade3) / 3;

                System.out.println("\nÖğrenci bilgileri:");
                System.out.println("Adı ve soyadı: " + Name);
                System.out.println("Not Ortalaması: " + average);
            }

            scanner.close();
        }
    }

