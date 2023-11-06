public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        Valet valet = new Valet("AFA312");
        HouseKeeping houseKeeping = new HouseKeeping(213);
        Cart cart = new Cart(1);

        frontDesk.serviceReq(valet);
        frontDesk.serviceReq(houseKeeping);
        frontDesk.serviceReq(cart);
    }
}
