public class Demo16 {
    public static void main(String[] args) {
        //String api
        //Exception handle
        //collection framework --> ArrayList, Hashmap, List
        //Multi Threaded Programing

        //Mysql
        //JDBC

        String name = "Yasindu"; //literal based string //char[] ar = {'Y','A','S'}
        String name1 = new String("Sathsara"); //object based string

        System.out.println(name.charAt(2));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.toCharArray());
        System.out.println(name.substring(2));
        System.out.println(name.length());

        String s1 = "Yasindu ";
        String s2 = "Sathsra";

        System.out.println(s1+s2);

        System.out.println(s1);
        System.out.println(s1.concat("Nipun"));
        System.out.println(s1);

        StringBuffer bf = new StringBuffer("ACPT");
        System.out.println("Buffer ===> "+bf);
        bf.append(" Academy");
        System.out.println("Buffer ===> "+bf);

        StringBuilder sb = new StringBuilder("AFSD");
        System.out.println("Builder ===> "+sb);
        sb.append(" Course");
        System.out.println("Builder ===> "+sb);

        //immutable ---> wenas kala nohaki

        //mutable ---> wensa kala haki

        String name3 = "Yasindu";
    }
}
