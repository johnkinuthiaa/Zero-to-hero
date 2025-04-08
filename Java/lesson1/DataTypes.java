public class DataTypes{
    public static void main(String[] args){
        /*
        - every variable in java must have a data type since java is statically typed
        -Different datatypes in java:
            int for whole numbers.
            double for decimals or floating numbers.
            char for single characters.
            String for text values-collection of characters.
            long
            boolean for holding true or false values
            shortt

         */ 
        int age =20;
        char letter ='A';
        String myName ="John";
        long ageOfSun =1234567654321234L;
        // double amount =100.45d;
        boolean isRaining =false;

        System.out.println("My name is "
        +myName+"\ni am "+age+"years old. My Initial is "+letter+
        "\nis today raining "+isRaining +".\nThe sun is "+ageOfSun +"years old.");
    }
}