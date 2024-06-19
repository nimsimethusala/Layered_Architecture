package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.custom.ItemDAO;
import com.example.layeredarchitecture.dao.custom.impl.ItemDaoImpl;
import com.example.layeredarchitecture.model.CustomerDTO;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class ItemBoImpl implements ItemBo{
    ItemDAO itemDAO = new ItemDaoImpl();

    public ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException {
        return itemDAO.getAll();
    }

    public boolean saveItem(ItemDTO item) throws SQLException, ClassNotFoundException{
        return itemDAO.save(item);
    }

    public void updateItem(ItemDTO item) throws SQLException, ClassNotFoundException{
        itemDAO.update(item);
    }

    public boolean existItem(String id) throws SQLException, ClassNotFoundException{
        return itemDAO.exist(id);
    }

    public void deleteItem(String id) throws SQLException, ClassNotFoundException{
        itemDAO.delete(id);
    }

    public String newItemId() throws SQLException, ClassNotFoundException{
        return itemDAO.newId();
    }

    public ArrayList<String> getAllItemId() throws SQLException, ClassNotFoundException{
        return itemDAO.getAllId();
    }

    public ItemDTO searchItem(String newValue) throws SQLException, ClassNotFoundException{
        return itemDAO.search(newValue);
    }
}
