    public class Tshirt {
    private double tprice;
    private String tname;

    Tshirt(double tprice, String tname) {
        this.tprice = tprice;
        this.tname = tname;
    }

    //Creating copy constructor
    Tshirt(Tshirt ts) {
        System.out.println("After invoking the constructor: ");
        tprice = ts.tprice;
        tname = ts.tname;
    }

//    creating a method that returns the price of the tees
    double showPrice() {
        return tprice;
    }

    String shoeName() {
        return tname;
    }

    public static void main(String[] args) {
        Tshirt ts1 = new Tshirt(200,"Oversized");
        Tshirt ts2 = new Tshirt(ts1);
        System.out.println(ts1.showPrice() == ts2.showPrice()?"This is a copy constructor":"This is not a copy constructor");
        System.out.println(ts1.shoeName());
    }

}
