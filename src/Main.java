import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a, b, c;

        System.out.print("1.sayi:");
        a = input.nextInt();

        System.out.print("2.sayi:");
        b = input.nextInt();

        System.out.print("3.sayi:");
        c = input.nextInt();

        if (a < b && a < c) {
            if (b < c) {
                System.out.println("a<b<c");

            } else {
                System.out.println("a<c<b");
            }
        } else if (b < c && b < a) {
            if (a < c) {
                System.out.println("b<a<c");

            } else {
                System.out.println("b<c<a");
            }
        } else   {
            if (b < a) {
                System.out.println("c<b<a");

            } else {
                System.out.println("c<a<b");
            }
        }


    }}