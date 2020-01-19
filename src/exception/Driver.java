package exception;

public class Driver {

    private int age;
    private String name;
    private String location;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException ();
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws InvalidNameException {

        if (name.trim().contains(" ")) {
            throw new InvalidNameException("Invalid name");
        }
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) throws InvalidLocationException {
        for (int i = 0; i < location.length(); i++)
            if (Character.isDigit(location.charAt(i))) {
                throw new InvalidLocationException(location + " is an Invalid location. There shouldn't be any number");
            }
        this.location = location;
    }
}
