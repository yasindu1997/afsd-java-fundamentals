import java.util.Scanner;

//class
public class Demo1 {
    //main method
    public static void main(String[] args) {

        greet();

        System.out.println("Helloooo");
        for(int i= 0;i<7;i++){
            System.out.println("Hiiii");
        }

        greet();

        int r = 89;
        int u = 90;
        System.out.println(r+u);

        //method calling statement
        greet();

        play();

        getSum(12,56);



        int[] numbers = new int[7];
        int x = 90;

        //parameterized method ---> int[] type
        //method functionality ---->sum all elements of the array

        //argument
        getTotal(numbers);

        //method calling statement
        int answer = countTotal(numbers);
    }

    //methods/functions
    public static void greet(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = scan.next();
        System.out.println("Good Morning "+name+" !");
    }


    //normal methods/ parameterized methods, return type method

    //normal method
    public static void play(){

    }

    //parameterized method
    public static void getSum(int x, int y){
        System.out.println("Total is "+(x+y));
    }

    public static void getTotal(int[] x){
        int total = 0;
        for(int num : x){
            total+=num;
        }
        System.out.println(total);
    }

    public static int countTotal(int[] x){
        int total = 0;
        for(int num : x){
            total+=num;
        }
        return total;
    }

}
