//original --> java Class
public class Student {
    //attributes
    String name;
    //I owned by class
    static int age;
    boolean isHaveGF;
    boolean isDrink;
    boolean isSing;

    double javaMarks;

    String job;

    //constructor --> default constructor
    public Student(){
        System.out.println("This is first constructor");
    }

    public Student(int x){
        System.out.println("This is second constructor");
    }

    public Student(String x, int y, boolean c){
        name=x;
        age=y;
        isDrink=c;
    }

    //behaviours

    //static method
    //static methods ---> static method
    public static void sing(){
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
