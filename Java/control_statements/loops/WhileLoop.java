package Java.control_statements.loops;

public class WhileLoop {
    /*
    is used to iterate a part of the program
     repeatedly until the specified Boolean condition is true. 
     As soon as the Boolean condition becomes false, the loop automatically stops.
    */ 
    public static void main(String[] args){
        int value =10;
        int i=0;
        while (i<value) {
            
            System.out.println(i);
            i++;
        }


        // do while loop - this loop executes atleast once before checking the condition of the while statement
        int j=0;
        do{
            // this will print first then check the condition
            System.out.println(j);
            j++;
        }while(i<10);
    }
}
