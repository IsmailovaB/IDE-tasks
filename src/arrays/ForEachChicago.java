package arrays;

public class ForEachChicago {
    public static void main(String[] args) {
        String [] cities = {"Ohio", "New York", "Chicago", "Miami", "Chicago"};

        boolean check = false;
        int count = 0;
        for(String cityNames: cities) {

            if (cityNames.equalsIgnoreCase("Chicago")) {
                check = true;
                count++;
            }

        }
        if(check) {
            System.out.println("Windy city found "+ count + " times");
        }else{
            System.out.println("Windy city not found");
        }

    }
}
