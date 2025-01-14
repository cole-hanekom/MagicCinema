package za.ac.cput.services.cart;

import za.ac.cput.entity.rentalcart.Cart;
import za.ac.cput.services.IService;

import java.util.Set;

public interface ICartService extends IService<Cart, Integer> {

    Set<Cart> getAll();
    Set<Cart> getCartFromCustomerId(String customerId);
}
