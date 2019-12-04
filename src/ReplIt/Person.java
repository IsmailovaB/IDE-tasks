package ReplIt;

public class Person {
        String firstName;
        String lastName;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Person(){
            this.firstName="un";


        }
        public Person( String firstName,String lastName){
            this.firstName=firstName;
            this.lastName=lastName;

        }
    }

