public class Variables {
    // make tax a static global variable so it can be accessed by all methods in the class variables
    static int tax =10;
    public static void main(String[] args ){
        /*
         * a variable is a container for holding data.It is a memory location
         * it must be declared and initialized before using it
         * Types: local,static,instance variables
         * A local variable is one declared inside a method or function and can only be accessed by members inside
          the function
         * A static variable is initialised using the keyword static and is created once then shared across the instances of the class
         * Static variables are not allocated memory at compile time and it only happens when the an instance of the variable is created
         */

        //  call the function
        createLocalVariable();
        // trying to use the variables declared in createLocalVariable fails because they are local variables and cannot be accessed from outside the method.
        // double totalAmount =salary*monthsWorked;

    }
    public static void createLocalVariable(){
        double salary=50000.0d;
        int monthsWorked =10;
        double totalAmount =(salary*monthsWorked);
        System.out.println("The gross salary is: ksh"+totalAmount);
        // here we can access tax which was declared as a global variable
        
        double taxToPay =(tax*totalAmount)/100;
        double netIncome =totalAmount-taxToPay;
        System.out.println("The net salary is: ksh"+netIncome);
        System.out.println("The tax is: ksh"+taxToPay);
    }
}