import java.util.*;
public class Practice_Quest_VarandDataTypes {
    public static void main(String[] Args){
        //PROGRAM 1
        //System.out.println("The count of numbers that need to be inputed");
        Scanner scn = new Scanner(System.in);
//        int i = scn.nextInt();
//        float a = scn.nextFloat();
//        float b = scn.nextFloat();
//        float c = scn.nextFloat();
//        float avg = (a + b+ c)/i;
//        System.out.println(avg);

//        //PROGRAM 2
//        System.out.println("Enter the side of the square");
//        float side = scn.nextFloat();
//        float area = (side * side);
//        System.out.println(area);

        //PROGRAM 3
        float a = scn.nextFloat();
        float b = scn.nextFloat();
        float c = scn.nextFloat();
        float bill = ( a + b + c + 0.18f * (a * b * c) );
        System.out.println(bill);
     }

}

