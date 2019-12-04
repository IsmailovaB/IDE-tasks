package variables;

public class Practice {
    public static void main(String[] args) {
        String companyName = "Facebook";
        String address = "Silicon Valley, CA";
        int numberOfEmployees = 10000;
        long revenue = 4000000L;
        boolean isTechCompany = true;
        System.out.println("The company name is " + companyName);
        System.out.println("adress is: " + address);
        System.out.println("Number of employees is " + numberOfEmployees);
        System.out.println("Annual revenue is " + revenue);
        System.out.println("Is it tech company? " + isTechCompany);
        System.out.println(companyName + isTechCompany);
        String aboutCompany = "Company " + companyName + ", is located " + address + ", which has " + numberOfEmployees +" employees. It's revenue " + revenue+ " And it is TECH COMPANY! " + isTechCompany;
        System.out.println(aboutCompany);
    }
}
