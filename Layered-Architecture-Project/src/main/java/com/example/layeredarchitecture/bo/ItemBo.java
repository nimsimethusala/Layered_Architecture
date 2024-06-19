package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ItemBo {
    public ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException;

    public boolean saveItem(ItemDTO item) throws SQLException, ClassNotFoundException;

    public void updateItem(ItemDTO item) throws SQLException, ClassNotFoundException;

    public boolean existItem(String id) throws SQLException, ClassNotFoundException;

    public void deleteItem(String id) throws SQLException, ClassNotFoundException;

    public String newItemId() throws SQLException, ClassNotFoundException;

    public ArrayList<String> getAllItemId() throws SQLException, ClassNotFoundException;

    public ItemDTO searchItem(String newValue) throws SQLException, ClassNotFoundException;
}
