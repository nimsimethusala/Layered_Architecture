package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.*;
import java.util.ArrayList;

public interface ItemDAO {
    public ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException;

    public void save(ItemDTO itemDTO) throws SQLException, ClassNotFoundException;

    public void update(ItemDTO itemDTO) throws SQLException, ClassNotFoundException;

    public void delete(String code) throws SQLException, ClassNotFoundException;

    public boolean existItems(String code) throws SQLException, ClassNotFoundException;

    public String newItemId() throws SQLException, ClassNotFoundException;

    public ArrayList<String> getAllId() throws SQLException, ClassNotFoundException;

    public void findItems();
}
