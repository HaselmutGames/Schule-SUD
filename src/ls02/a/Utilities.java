package ls02.a;

import java.util.Scanner;

public class Utilities {
    static Scanner scanner = new Scanner(System.in);
    static int choice;
    public static void main(String[] args) {

        while(true){
            mainMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    menuOptionOne();
                    double temp = scanner.nextDouble();
                    temp = convertToCelsius(temp);
                    System.out.println("Temperature is : " + temp + " Celsius.");
                    System.out.println("======================================");
                    break;
                case 2:
                    menuOptionTwoOrThree();
                    temp = scanner.nextDouble();
                    temp = convertToFahrenheit(temp);
                    System.out.println("Temperature is : " + temp + " Fahhrenheit.");
                    System.out.println("======================================");
                    break;
                case 3:
                    menuOptionTwoOrThree();
                    temp = scanner.nextDouble();
                    temp = convertToKelvin(temp);
                    System.out.println("Temperature is : " + temp + " Kelvin.");
                    System.out.println("======================================");
                case 4:
                    break;
                default:
                    System.out.println("Invalid input, try again");
                    System.out.println("======================================");
                    break;
            }
            if(choice == 4){
                System.out.println("Goodbye");
                break;
            }
        }
    }

    @SuppressWarnings("unused")
    private static double roundToDecimalPlaces(double number, int decimalPlace){
        double factor = Math.pow(10, decimalPlace);
        return Math.round(number * factor) / factor;
    }

    private static double convertToCelsius(double fahrenheitTemp){
        double celsiusTemp;
        celsiusTemp = (fahrenheitTemp - 32) / 1.8;
        return celsiusTemp;
    }

    private static double convertToFahrenheit(double celsiusTemp){
        double fahrenheitTemp;
        fahrenheitTemp = celsiusTemp * 1.8 + 32;
        return fahrenheitTemp;
    }

    private static double convertToKelvin(double celsiusTemp){
        double kelvinTemp;
        kelvinTemp = celsiusTemp + 273.15;
        return kelvinTemp;
    }

    private static void mainMenu(){
        System.out.println("Choose what you want to do: ");
        System.out.println("======================================");
        System.out.println("1 - convert from fahrenheit to celsius");
        System.out.println("2 - convert from celsius to fahrenheit");
        System.out.println("3 - convert from celsius to kelvin");
        System.out.println("4 - exit");
        System.out.println("======================================");
        System.out.print("Enter your options' number: ");
    }

    private static void menuOptionOne(){
        System.out.println("Option 1 selected:");
        System.out.println("Enter your fahrenheit temperature:");
    }

    private static void menuOptionTwoOrThree(){
        if(choice == 2){
            System.out.println("Option 2 selected:");
            System.out.println("Enter your Celsius temperature:");
        }
        if(choice == 3){
            System.out.println("Option 3 selected:");
            System.out.println("Enter your Celsius temperature:");
        }
    }
}
