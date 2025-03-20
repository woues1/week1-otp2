package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import java.util.Locale;
import java.util.ResourceBundle;

class shoppingcartappTest {

    @Test
    void addItem() {
        shoppingcartapp cart = new shoppingcartapp();
        cart.addItem(2, 5.0);
        assertEquals(10.0, cart.totalCost);
        cart.addItem(3, 2.0);
        assertEquals(16.0, cart.totalCost);
    }

}