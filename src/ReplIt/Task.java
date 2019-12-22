package ReplIt;

public class Task {
    public static void main(String[] args) {
        String [] str = {"air", "Terracotta Necklace", "Coffee Mug",};

    }
    public static String[] ITEMS = {"Cactus", "T Shirt", "air", "Terracotta Necklace", "Coffee Mug", "Wood Crate Wall Storage", "Blanket", "Knife", "Copper Coffee and Tea Kettle", "Wall Art",
            "Marble Clock", "Natural Bench", "Llama Valley Framed Print", "Gold Metal Frame Mirror", "Fork", "Star Wars game", "Barracuda", "Anchor", "Sunlight", "planet Saturn"};
    //corresponding prices
    public static double[] PRICES = {49.99, 13.99, 5.99, 14.99, 29.99, 11.50, 79.99, 23.80, 27.99, 39.44, 78.40, 299.30, 55.00, 176.89, 4.99, 67.00, 8.19, 50.00, 1500, 400};
    public String[] SPECIAL_ITEMS = {"Cactus", "Fork" , "T Shirt"};
    public double SHIPPING_CHARGE = 11.50;


    public double findItemPrice(String item){
        //TODO
        for(int i = 0; i<ITEMS.length; i++){
            if(ITEMS[i].equals(item)){
                return PRICES[i];
            }
        }
        return 0.0;
    }

    public int discountByItemCount(String[] order, boolean isMember) {
        //TODO
        int total = 0;
        if(order.length>=10){

            if(isMember){

                return 10;
            }
            else{

                return 5;
            }
        }
        return 0;
    }

    public double getOrderTotalWithoutDiscount(String[] order) {
        //TODO
        double total = 0.0;
        for(String item: order) {
            total += findItemPrice(item);
        }
        return total;
    }

    public int discountByItemPrice(String[] order, boolean isMember) {
        //TODO
        int count=0;
        int discount=0;
        for(int i=0;i<order.length;i++){
            if(isMember&&findItemPrice(order[i])>50){
                count++;
            }
            if(!isMember && findItemPrice(order[i])>75){
                count++;
            }
        }
        if(count>=3){
            if(isMember){
                return 18;
            }
            else return 7;
        }
        return 0;
    }



    public boolean isShippingFree(String[] order, boolean isMember) {
        if((isMember&&getOrderTotalWithoutDiscount(order)>75)||(!isMember&&getOrderTotalWithoutDiscount(order)>150)){
            return true;
        }
        return false;
    }

    public double calculateOrderTotalWithDiscountsAndShipping(String[] order, boolean isMember){

        // for(int i = 0; i<order.length; i++){

        double totalWithAllDiscount=0;
        if(discountByItemPrice ( order , isMember )  >= discountByItemCount( order , isMember )){
            totalWithAllDiscount = getOrderTotalWithoutDiscount ( order )-(getOrderTotalWithoutDiscount ( order )*Double.valueOf(discountByItemPrice ( order , isMember )));
        } else {
            totalWithAllDiscount = getOrderTotalWithoutDiscount ( order )-(getOrderTotalWithoutDiscount ( order )*Double.valueOf(discountByItemCount ( order , isMember )));

        }
        if(!isShippingFree(order, isMember)){
            totalWithAllDiscount+=SHIPPING_CHARGE;
        }

        return totalWithAllDiscount;
    }
}
