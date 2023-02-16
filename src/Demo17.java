import java.util.ArrayList;

public class Demo17 {
    public static void main(String[] args) {
        //Syntax error
//        int x = 10;
//        System.out.println(c);

        try {
            int v = 8;
            System.out.println(v / 0);
        }catch (ArithmeticException ex){
            System.out.println("0 n bedala thenne..check krnna....");
        }

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Mysql Driver Not Included !");
        }

        try{

        }finally {

        }

        int[] ar = new int[10]; //only integers --> only 10 ints

        ArrayList arl = new ArrayList();
        arl.add(120);
        arl.add("Strings");

        Demo19 demo = new Demo19();

        Object d = new Example();

        int x;

        Integer f;

        double h;

        Double t;
    }
}
