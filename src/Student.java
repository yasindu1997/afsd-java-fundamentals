//original --> java Class
public class Student {
    //local variables, instance variables, static variables

    //instance variables ---> int=0, double=0.0, String=null, boolean=false
    //attributes
    String name;
    //I owned by class

    //static variables
    static int age;
    boolean isHaveGF;
    boolean isDrink;
    boolean isSing;

    double javaMarks;
    String job;

    //constructor --> default constructor
    public Student(){
        System.out.println("Hello I am Instance block");
        System.out.println("Hello I am constructor");
    }

    public Student(int x){
        System.out.println("This is second constructor");
    }

    public Student(String name, int age, boolean isDrink){
        this.name = name;
        this.age = age;
        this.isDrink = isDrink;
    }

    //instance block
    {

    }

    //static block
    static{

    }

    //behaviours

    //static method
    //static methods ---> static method
    public static void sing(){
        //local variables
        int x=90; //default value ---> no | should initialize
        System.out.println(x);
    }

    //non-static method
    public void dance(){
        play();
    }

    //non-static method ----> static/non-static
    public void play(){
        sing();
    }


}
