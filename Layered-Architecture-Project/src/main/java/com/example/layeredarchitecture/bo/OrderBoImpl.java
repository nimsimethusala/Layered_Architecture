package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.SQLUtil;
import com.example.layeredarchitecture.dao.custom.OrderDAO;
import com.example.layeredarchitecture.dao.custom.impl.OrderDAOImpl;
import com.example.layeredarchitecture.model.OrderDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class OrderBoImpl implements OrderBo{
    OrderDAO orderDAO = new OrderDAOImpl();
    public String newOrderId() throws SQLException, ClassNotFoundException {
        return orderDAO.newId();
    }

    @Override
    public boolean existOrder(String orderId) throws SQLException, ClassNotFoundException {
        return orderDAO.exist(orderId);
    }

    @Override
    public void deleteOrder(String id) throws SQLException, ClassNotFoundException {
        orderDAO.delete(id);
    }

    @Override
    public boolean saveOrder(String orderId, LocalDate orderDate, String customerId) throws SQLException, ClassNotFoundException {
        return orderDAO.save(orderId, orderDate, customerId);
    }

    @Override
    public ArrayList<String> getAllOrderId() throws SQLException, ClassNotFoundException {
        return orderDAO.getAllId();
    }

    @Override
    public OrderDTO searchOrder(String newValue) throws SQLException, ClassNotFoundException {
        return orderDAO.search(newValue);
    }

    @Override
    public ArrayList<OrderDTO> getAllOrder() throws SQLException, ClassNotFoundException {
        return orderDAO.getAll();
    }

    @Override
    public boolean saveOrder(OrderDTO customer) throws SQLException, ClassNotFoundException {
        return orderDAO.save(customer);
    }


    @Override
    public void updateOrder(OrderDTO customer) throws SQLException, ClassNotFoundException {
        orderDAO.update(customer);
    }
}
