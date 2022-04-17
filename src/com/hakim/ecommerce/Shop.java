package com.hakim.ecommerce;

public class Shop {
    public static void main(String[] args) {
        ShoppingCart cart=new ShoppingCart();

        Product a20s =new Product("Samsung Galaxy a20s",250,5,200,new Dimension(6,3,4));

        cart.addProduct(a20s);

        System.out.println("shoppingCart="+cart);
        int totalPrice=cart.getTotalPrice();
        System.out.println("totalPrice = "+totalPrice);
    }
}
