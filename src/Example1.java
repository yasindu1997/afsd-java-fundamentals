//Example1 ---> sub class
//Example ---> super class
public class Example1 extends Example{

    //default constructor
    public Example1() {
        super();
        System.out.println("Example1 constructor");
    }

    public void sing(){
        dance();
        play();
        System.out.println(name);
    }

    public void dance(){

    }
}
