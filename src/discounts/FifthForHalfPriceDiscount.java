package discounts;

import model.Cart;
import model.CartItem;
import model.Product;


public class FifthForHalfPriceDiscount implements ICanApplyDiscount{

    public boolean canApplyDiscount(Cart cart){
        return cart.totalPriceOfProducts()>500;
    }

    public void applyDiscount(Cart cart) {
        CartItem fifthProduct = cart.getItems().get(4);
        fifthProduct.setCurrentPrice(fifthProduct.getCurrentPrice()*0.5);
    }
}
