package OCA.implementsIinterfaces;

import OCA.interfaces.userId;

import java.util.HashMap;

public class Cart implements userId {

    boolean cart;

    public  Cart(boolean cartState){
        this.cart = cartState;
    }

    @Override
    public int cart(HashMap items) {

        return 0;
    }

    @Override
    public int address(String address) {
        return 0;
    }

    @Override
    public int phone_number(int number) {
        return 0;
    }
}
