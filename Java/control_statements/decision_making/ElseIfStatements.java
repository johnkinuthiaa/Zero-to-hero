package Java.control_statements.decision_making;

public class ElseIfStatements {
    public static void main (String[] args){
        /*
        * else if statements are used to check for multiple conditions
        * structure: if(condition){do this}else if(condition 2){do this}
        */ 
        int marks =29;
        if(marks<=29){
            // will print out this because marks =29
            System.out.println("You scored an E.");
        }else if(marks<=39){
            System.out.println("D");
        }else if(marks<=49){
            System.out.println("C");
        }else if(marks<=59){
            System.out.println("B");
        }else if(marks<69){
            System.out.println("B+");
        }else{
            System.out.println("A");
        }
    }
    
}
