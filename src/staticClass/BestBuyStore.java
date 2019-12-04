package staticClass;

public class BestBuyStore {
    public static void main(String[] args) {
        BestBuy storeOne = new BestBuy("Chicago");
        BestBuy storeTwo = new BestBuy("Ohio");

         storeOne.info();
         BestBuy.numOfComputers--;
         storeTwo.info();
//        System.out.println(BestBuy.numOfComputers);
    }
}
