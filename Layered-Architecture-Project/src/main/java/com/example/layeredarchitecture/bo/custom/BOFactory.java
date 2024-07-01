package com.example.layeredarchitecture.bo.custom;

import com.example.layeredarchitecture.bo.custom.impl.CustomerBoImpl;
import com.example.layeredarchitecture.bo.custom.impl.ItemBoImpl;
import com.example.layeredarchitecture.bo.custom.impl.PlaceOrderBoImpl;
import com.example.layeredarchitecture.dao.DAOFactory;
import com.example.layeredarchitecture.dao.SuperDAO;
import com.example.layeredarchitecture.dao.custom.impl.*;

public class BOFactory {
    private static BOFactory boFactory;

    private BOFactory(){

    }

    public static BOFactory getBoFactory(){
        return (boFactory == null) ? boFactory = new BOFactory() : boFactory;
    }

    public enum BOTypes{
        CUSTOMER_BO,ITEM_BO,PLACE_ORDER_BO
    }

    public SuperBO getBO(BOFactory.BOTypes boTypes){
        switch (boTypes){
            case CUSTOMER_BO:
                return new CustomerBoImpl();
            case ITEM_BO:
                return new ItemBoImpl();
            case PLACE_ORDER_BO:
                return new PlaceOrderBoImpl();
            default:
                return null;
        }
    }
}
