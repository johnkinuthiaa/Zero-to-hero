package Java.control_statements.decision_making;
/*
 * if statements control the code execution based on a given condition
 * the condition must be met for the code to be executed.
 * basic structure : if(condition){do this}
 */
public class IfStatements {
    public static void main(String[] args){
        int temperature =25;
        boolean isRainingToday =false;
        /*
        * for this...we'll check if it is raining or if the temperatures are above or equal to 22
        * if it is raining...tell the person to carry an umbrella
        * if the temperature is above 22...tell the person to apply sunscreen
        * Example:
         */ 

        if(temperature>=22){
            // this will be printed because the condition (temperature>=22) is true
            System.out.println("It is hot outside! Remember to apply sunscreen");
        }
        // this will not be printed out because is raining is false (isRainingToday==true) is the same as (isRainingToday)
        if(isRainingToday){
            System.out.println("it is raining.Carry your umbrella");
        }
    }
}
