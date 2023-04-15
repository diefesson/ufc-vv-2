package com.diefesson.vv2.q2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShoppingCartTest {

    private Product product1;
    private Product product2;
    private Product product3;
    private Product extraProduct;
    private ShoppingCart shoppingCart;

    @BeforeEach
    public void setup() {
        product1 = new Product("product 1", 1.0);
        product2 = new Product("product 2", 2.0);
        product3 = new Product("product 3", 4.0);
        extraProduct = new Product("product 4", 8.0);
        shoppingCart = new ShoppingCart();
        shoppingCart.addItem(product1);
        shoppingCart.addItem(product2);
        shoppingCart.addItem(product3);
    }

    @Test
    public void createdHasZeroItems() {
        ShoppingCart newlyCreated = new ShoppingCart();
        assertEquals(0, newlyCreated.getItemCount());
    }

    @Test
    public void emptyHasZeroItems() {
        shoppingCart.empty();
        assertEquals(0, shoppingCart.getItemCount());
    }

    @Test
    public void addItemIncrementsCount() {
        shoppingCart.addItem(extraProduct);
        assertEquals(4, shoppingCart.getItemCount());
    }

    @Test
    public void addItemAddsBalance() {
        shoppingCart.addItem(extraProduct);
        assertEquals(4, shoppingCart.getItemCount());
    }

    @Test
    public void removeDecrementsCount() throws ProductNotFoundException {
        shoppingCart.removeItem(product3);
        assertEquals(2, shoppingCart.getItemCount());
    }

    @Test
    public void removeNotIn(){
        assertThrows(ProductNotFoundException.class, () -> shoppingCart.removeItem(extraProduct));
    }

}
