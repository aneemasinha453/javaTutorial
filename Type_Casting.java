import java.util.Scanner;

public class Type_Casting {
    public static void main(String[] Args){

        /*Type casting is done in the case of "lossy conversions" i.e. the conversions in which we want to
          convert one data type which takes more memory space to another data type which takes lee memory
          space. For example - Converting a variable of "float" data type to a variable of "long" data type
          SAMPLE CODE IS AS FOLLOWS*/
        System.out.println("Enter a number \"a\" ");
        Scanner scn = new Scanner(System.in);
        float a = scn.nextFloat();
        System.out.println("Enter a number \"b\" ");
        float b = scn.nextFloat();
        /*In the step done below there would have been an error if "int" was not written before (a + b) as
        c variable is of the data type "int" but (a + b) would give an output of the data type float and
        both of them are incompatible.Hence the type conversion was needed. */
        int c  = (int)(a + b);
        System.out.println( c );
    }
}
