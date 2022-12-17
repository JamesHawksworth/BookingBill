package org.example;

public class computeBills {

    double price = 14.99;
    double taxRate = 0.08;
    double totalPrice;

    public double computeBill()
    {
        double taxPrice;
       taxPrice = price * taxRate;
       totalPrice = price + taxPrice;
        return totalPrice;
    }
    public double computeBill(int quantityOrderd){

     double priceWithTax;

     priceWithTax = quantityOrderd * computeBill();

      return  priceWithTax;
    }
    public double computeBill(int quantityOrderd, double coupon){

        double priceWithCoupon;
        double priceWithCouponAndTax;
        priceWithCoupon = (quantityOrderd * price) - coupon;
        priceWithCouponAndTax = priceWithCoupon * taxRate;

     return priceWithCoupon + priceWithCouponAndTax;
    }


}

