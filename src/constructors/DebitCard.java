package constructors;

public class DebitCard {
    long cardNumber;
    String holderName;
    String cardType;
    int pin;
    double balance;

    public DebitCard(long cardNumber, String holderName, double balance){
        String cardNum = String.valueOf(cardNumber);
        this.holderName=holderName;
        this.balance=balance;

        if(cardNum.length()==16) {
            this.cardNumber = cardNumber;
        }else {
            System.out.println("Invalid Card Number");
        }
    }

    public DebitCard(long cardNumber, String holderName, String cardType, int pin, double balance){
        this(cardNumber,holderName,balance);

        String str = String.valueOf(pin);
        if(String.valueOf(pin).length()==4){
            this.pin = pin;
        }else {
            System.out.println("Invalid pin length");
        }
        if(cardType.equalsIgnoreCase("MasterCard")||cardType.equalsIgnoreCase("Visa")) {
            this.cardType=cardType;
        }
    }
    public void info(){

        System.out.println("Card Number: "+cardNumber);
        System.out.println("Holder Name: "+holderName);
        System.out.println("Balance: "+balance);

        if(cardType!=null) {
                System.out.println("Card Type: " + cardType);
            }

        }
    }

