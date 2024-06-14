package com.example.layeredarchitecture.dao;

import java.sql.SQLException;
import java.time.LocalDate;

public interface OrderDAO {
    public String newOrderId() throws SQLException, ClassNotFoundException;

    public boolean orderIdExists(String orderId) throws SQLException, ClassNotFoundException;

    public int save(String orderId, LocalDate orderDate, String customerId) throws SQLException, ClassNotFoundException;
}
