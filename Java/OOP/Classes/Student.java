package Java.OOP.Classes;

// a class is a collection related of data and values put together.
//  A class has methods->what a class can do and attributes which are the values for the class
public class Student {
    /*
    * these are the attributes of the student:
    * a student can have a name,an id and a course
    */ 
    int id;
    String name;
    String course;
    /*
    A constructor is an initializer for the class and it defines the attributes 
    set up for the class during initialization of the class using the new keyword.
    A constructor has same name as the class name and can be empty(no args constructor)
    or have arguments
    */ 
    // empty
    public Student(){}
    /*
    all args constructor ->this has all the atributes defined in the class and
     allows us to add the values during initialization using new keyword
     ie. 
     Student student =new Student("john",1,"computer science")
     */ 
    public Student(String name,int id,String course){
        this.name =name;
        this.id=id;
        this.course=course;
    }
    public void printStudentInfo(){
        System.out.println("Name: "+this.name+"\nid: "+id+"\ncourse: "+this.course +"\n\n");
    }

    public static void main(String[] args){
        // the new keyword is used to initialize and create an object from the class that makes student1 an object
        Student student1 =new Student();
        student1.course="Computer science";
        student1.id=1;
        student1.name="john";
        student1.printStudentInfo();


        // we can create multiple objects from the student class eiter using empty constructuo or all args constructor
        Student student2 =new Student();
        student2.course="Infomation technology";
        student2.id=2;
        student2.name="kisanga";
        student2.printStudentInfo();

        // creating the student using all args constructor
        Student student3 =new Student("Peter",3,"Data science");
        student3.printStudentInfo();
    }
}
