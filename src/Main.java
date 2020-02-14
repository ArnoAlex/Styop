import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (; ; ) {
            System.out.println("Hello my friend, import integer values (1-10)");
            System.out.println("Add first number");
            Scanner in = new Scanner(System.in);
            int firstValue = in.nextInt();
            System.out.println("Add second number");
            Scanner in1 = new Scanner(System.in);
            int secondvalue = in1.nextInt();
            System.out.println("nermuci gorcoghutyun@ harazat");
            Scanner in2 = new Scanner(System.in);
            char c = in2.next().charAt(0);
            if (c == '+') {
                System.out.println(firstValue + secondvalue);
            } else if (c == '-') {
                System.out.println(firstValue - secondvalue);
            } else if (c == '/') {
                System.out.println(firstValue / secondvalue);
            } else if (c == '*') {
                System.out.println(firstValue * secondvalue);
            } else
                System.out.println("Error" + " import integer values (1-10)");


        }

    }
}