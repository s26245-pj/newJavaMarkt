package discounts;

import model.Cart;
import model.CartItem;
import java.util.Collections;

public class ThreeInTwoDiscount implements ICanApplyDiscount {
    public boolean canApplyDiscount(Cart items){
        return items.getItems().size()>2;
    }

    public void applyDiscount(Cart cart){
        CartItem cheapestItem = Collections.min(cart.getItems());
        cheapestItem.setCurrentPrice(0.0);
        }
}
