public class Cart implements HotelService {
    private int numberOfCarts;

    public Cart(int numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
    }

    @Override
    public void serviceExecute() {
        cartReq(numberOfCarts);
    }

    public void cartReq(int numberOfCarts) {
        System.out.println("Luggage cart request for " + numberOfCarts + " cart(s)." + "\n");
    }
}