package Strings;

public class CarsBrand {
    public static void main(String[] args) {
        String carGarage = "Toyota, BMW, Jaguar";

        if(carGarage.isEmpty()){
            System.out.println("Garage is empty");
        }if(carGarage.contains("BMW")){
            System.out.println("There is a German car in your garage");
        }if(carGarage.contains("Toyota")||carGarage.contains("Nissan")){
            System.out.println("There is a Japanese car in you garage");
        }if(carGarage.contains("Maserati")){
            System.out.println("There is an Italian car in your garage");
        }if(carGarage.contains("Jaguar")){
            System.out.println("There is British car in your garage");

        }
    }
}
