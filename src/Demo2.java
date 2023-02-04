import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
      //double[] marks = new double[10];

      double[] marks = {12.5,78.3,56.6,65.4,53.2};

      double[] result = incrementArry(marks);

        System.out.println(Arrays.toString(result)); // [13.5,79.3,57.6,66.4,54.2]



        //x++, x-- [post increment/decrement] ---> ++x , --x [pre increment / decrement]
        int f = 10;
        //f++; //f = f+1
        System.out.println(++f);

    }

    //create method
    private static double[] incrementArry(double[] marks) {
        double[] result = new double[marks.length];

        for(int i=0;i< marks.length;i++){
            result[i]=++marks[i];
        }
        return result;
    }


    //method overloading

    //parameter count 0
    public static void dance(){

    }

    //parameter count 1
    public static int dance(int x){
        return 1;
    }

    public static int dance(String y){
        return 2;
    }

}
