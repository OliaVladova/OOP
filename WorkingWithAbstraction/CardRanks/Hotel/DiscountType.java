package WorkingWithAbstraction.Hotel;

public enum DiscountType {
    //•	20% for VIP clients - VIP
    VIP(20),
    //•	10% for clients, visiting for a second time - SecondVisit
    SecondVisit(10),
    //•	0% if there is no discount - None
    None(0);
    private int discount;

    DiscountType(int discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
