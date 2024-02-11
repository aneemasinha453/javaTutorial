import java.util.Scanner;

public class lab3prog4 {
    public static void subtractor(int a, int b) {
        int result=0;
        result =  a - b;
        System.out.println("the result is " + result);
    }

    public static void subtractor(float a, float b) {
        float result = 0;
        result = a - b;
        System.out.println("the result is " + result);

    }

    public static void main(String[] args) {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a: ");
        float a = sc.nextFloat();
        System.out.println("enter b: ");
        float b = sc.nextFloat();
        subtractor((int)a, (int)b);
        subtractor(a, b);
    }
}


