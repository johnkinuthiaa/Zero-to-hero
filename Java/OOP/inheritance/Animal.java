package Java.OOP.inheritance;

public class Animal {
    public String name;
    public int legs;
    public String diet;

    public Animal(){};
    public Animal(String name,int legs,String diet){
        this.name=name;
        this.legs=legs;
        this.diet=diet;
    };
    public String eat(){
        return this.name+" is eating";
    }
    public String walk(){
        return this.name+" is walking";
    }
    public void talk(){
        System.out.println("An animal talks");
    }
    public static void main (String[] args){

        Cat c1 =new Cat();
        // c1.name is not defined in cat but it works because it is declared in Animal which is a parent to the cat class
        c1.name="cat";
        c1.legs=4;
        c1.talk();
        System.out.println(c1.walk());

    }
}
/*
we inherit another class's properties by using extends keyword the Animal is the parent and the cat is the child
when a child extends a parent,it has access to all its methods and attributes but can override and change some methods.
*/ 
class Cat extends Animal {
    @Override
    public void talk(){
        System.out.println("A cat meows");
    }
}
