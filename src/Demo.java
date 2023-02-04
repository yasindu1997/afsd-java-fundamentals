import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] rain_data = new double[7];

        for(int i=0; i<rain_data.length;i++){
            System.out.print("Enter rain data for day "+(i+1));
            rain_data[i]=scan.nextDouble();
        }

        double total_rain_data=0.0;

        for(int i=0; i<rain_data.length;i++){
            total_rain_data+=rain_data[i];
        }

        double avg_rain_data = total_rain_data/rain_data.length;

        System.out.println(avg_rain_data);

        //for-each
        for(double data : rain_data){
            System.out.println(data);
        }
    }
}
