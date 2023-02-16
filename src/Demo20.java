import lk.acpt.app.Demo22;
import view.Demo21;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Demo20 {
    public static void main(String[] args) {
        final int x = 78;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number 1 : ");
        int num1 = scan.nextInt();

        System.out.print("Enter a number 2 : ");
        int num2 = scan.nextInt();

        try {
            System.out.println(num1 / num2);
        }catch (ArithmeticException ex){
            System.out.println("Do not use 0 ...!");
        }

        System.out.println("End of the program");

        //compile time exception

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException ex){
            System.out.println("Check Your Mysql Driver...!");
        }

        System.out.print("Enter a number as a String : "); //"13", 13
        String number = scan.next();

        try {
            getSum(number);
        }catch (Exception  ex){
            System.out.println("Numbers witharak input krnna...");
        }

        System.out.println("End of the whole program");

        try{
            //---> bar code scan
        }catch (ArrayIndexOutOfBoundsException ex){

        }finally {
            System.out.println("Thank You !");
        }

        Demo21 demo21= new Demo21();
        Demo22 demo22=new Demo22();

        int[] ar = new int[12]; //only ints, has fixed length

        //java.util ---> ArrayList, List, Hashmap, TreeSet;
        //<> - genaric
        ArrayList arrayList = new ArrayList();
        arrayList.add("Yasindu");
        arrayList.add(10);
        arrayList.add(new Scanner(System.in));

        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));

        //byte,short,int,double,char ---> primitive data types

        //wrapper classes
        Integer num8 = new Integer(23);
        Double num9;

        //boxing
        int f = 45;
        Integer num10 = new Integer(f);

        //unboxing
        int y = num8;

        String name;

        HashMap map = new HashMap();
        map.put("name","Yasindu");
        map.put("address","panadura");
        map.put("age",30);

        System.out.println(map.get("age")); //30
        System.out.println(map.get("name")); //yasindu
    }

    public static void getSum(String number) throws NumberFormatException{
            int value = Integer.parseInt(number);
            System.out.println(value);
    }
}
