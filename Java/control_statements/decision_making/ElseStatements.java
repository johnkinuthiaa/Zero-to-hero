package Java.control_statements.decision_making;

public class ElseStatements {
    /*
    * else statements are executed if an if statement fails.if the condition specified in the if is not met,
    the condition becomes false and the code block inside it cannot be executed so an else statement is
    executed instead.
    */ 
    public static void main (String[] args){
        double bodyWeight =47.5;
        /*
        this checks for the minimum weight for blood donation which is 50kgs. if the condition is not met
        the else statement is triggered and prints out You are undeweight and can't donate blood
        */
        if(bodyWeight>50){
            System.out.println("You can proceed to blood donation");
        }else{
            System.out.println("You are undeweight and can't donate blood");
        }
    }
    
}
