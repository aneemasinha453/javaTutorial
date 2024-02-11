import java.util.*;
public class AccentureBMI {
    public static void main(String[] args){
        double weight,height;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the weight");
        weight = scn.nextDouble();
        System.out.println("Enter the height");
        height = scn.nextDouble();
        double BMI = weight/(height*0.01*height*0.01);
        if(BMI <= 18.5){
            System.out.println("Oops! You're underweight");
        }
        if(BMI > 18.5 && BMI <= 25 ){
            System.out.println("Yay! You're normal weight");
        }
        if(BMI > 25){
            System.out.println("Sorry! You're overweight");
        }
    }
}
