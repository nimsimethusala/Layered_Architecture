package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.*;
import java.util.ArrayList;

public interface CustomerDAO {
    public ArrayList<CustomerDTO> getAllCustomer() throws SQLException, ClassNotFoundException;

    public void save(CustomerDTO customer) throws SQLException, ClassNotFoundException;

    public void update(CustomerDTO customer) throws SQLException, ClassNotFoundException;

    public boolean existCustomers(String id) throws SQLException, ClassNotFoundException;

    public void delete(String id) throws SQLException, ClassNotFoundException;

    public String newId() throws SQLException, ClassNotFoundException;

    public ArrayList<String> getAllId() throws SQLException, ClassNotFoundException;
}
