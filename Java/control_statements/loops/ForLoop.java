package Java.control_statements.loops;

public class ForLoop {
    public static void main (String[] args){
        /*
        a for loop is used to execute a command multiple times until a condition is met
        the loop has 3 parts:
        initialization:- this is where the variable of the loop is initialized.
        condition:- this is the value which determines if the loop will be executed. 
                    The condition must be met for the loop to work.
                    The loop continues untill the condition is false
        increment/decrement:- It increments or decrements the variable value.

        for(initialization; condition; increment/decrement){    
            statement or code to be executed    
        }    
         */ 

        //  lets print all values from 1-10 

        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
        //  lets print all values from 10-0 
        
        for(int i=10;i>=0;i--){
            System.out.println(i);
        }
        // we can use a for loop inside a for loop.
        for(int i=0;i<=10;i++){
            for(int j=10;j>i;j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        // for each loop -this is used to iterate through values of an array
        String mySDevs[] ={"felex","suleiman","shac","sheddy"};
        for(String dev:mySDevs){
            System.out.println(dev+" is an amaizing developer");
        }



    }
}
