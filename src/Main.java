import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;
        double sum=0;

        Scanner inp = new Scanner(System.in);
        System.out.print("Harmonik serisi hesaplanacak sayıyı giriniz: ");
        number = inp.nextInt();

        for (int i = 1; i <= number; i++) {
            sum += 1.0/i;
        }
        System.out.println("Seri sonucu: "+sum);
    }
}
