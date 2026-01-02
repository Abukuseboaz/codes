public class shoppingCart {
    public static void main(String[] args) {
        //declare and initialize array of prices
        int[] prices = {120, 80, 150, 200, 90};
        int total=0;
        //calculate total price using enhanced for loop
        for(int price: prices){
            total += price;

        }
        //print total price
        System.out.println("Total price: " + total);
    }
}