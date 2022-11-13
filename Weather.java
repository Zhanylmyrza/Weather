import java.util.Arrays;
import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        double[] fahrenheit=celsiusToFahrenheit(celsius);
        
        printTemperatures(celsius, "Celsius");
        printTemperatures(fahrenheit, "Fahrenheit");
    }

    public static double[] celsiusToFahrenheit(double[]celsius){
        double[] fahrenheit=Arrays.copyOf(celsius, celsius.length);
        for(int i=0;i<fahrenheit.length;i++){
            fahrenheit[i]=(celsius[i]/5)*9+32;
        }
        return fahrenheit;
    }

    public static void printTemperatures(double[] temp, String tempType){
        System.out.print(tempType + ": ");
        for(int i=0; i<temp.length;i++){
            System.out.print(temp[i] + " ");
        }
        System.out.print("\n");

    }

}
