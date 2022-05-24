package WorkingWithAbstraction.Hotel;

public class PriceCalculator {

    public static double totalPrice(double pricePerDay,int numberDays, Season season, DiscountType type ){
        double price = pricePerDay*numberDays;
        price = price * season.getMultiply();
        price = price * (100 - type.getDiscount())/100.0;
        return price;
    }
}
