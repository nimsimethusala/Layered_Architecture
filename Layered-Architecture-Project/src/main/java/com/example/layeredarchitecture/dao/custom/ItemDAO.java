package com.example.layeredarchitecture.dao.custom;

import com.example.layeredarchitecture.dao.CrudDAO;
import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.*;
import java.util.ArrayList;

public interface ItemDAO extends CrudDAO<ItemDTO> {
    ItemDTO findItems(String code) throws SQLException, ClassNotFoundException;

    public boolean searchAndUpdate(ItemDTO item) throws SQLException, ClassNotFoundException;
}
