package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public interface OrderBo {
    public String newOrderId() throws SQLException, ClassNotFoundException;

    public boolean existOrder(String orderId) throws SQLException, ClassNotFoundException;

    public void deleteOrder(String id) throws SQLException, ClassNotFoundException;

    public boolean saveOrder(String orderId, LocalDate orderDate, String customerId) throws SQLException, ClassNotFoundException;

    public ArrayList<String> getAllOrderId() throws SQLException, ClassNotFoundException;

    public OrderDTO searchOrder(String newValue) throws SQLException, ClassNotFoundException;

    public ArrayList<OrderDTO> getAllOrder() throws SQLException, ClassNotFoundException;

    public boolean saveOrder(OrderDTO customer) throws SQLException, ClassNotFoundException;

    public void updateOrder(OrderDTO customer) throws SQLException, ClassNotFoundException;
}
