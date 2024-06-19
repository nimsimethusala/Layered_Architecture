package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CrudDAO<T> {
    public ArrayList<T> getAll() throws SQLException, ClassNotFoundException;

    public boolean save(T customer) throws SQLException, ClassNotFoundException;

    public void update(T customer) throws SQLException, ClassNotFoundException;

    public boolean exist(String id) throws SQLException, ClassNotFoundException;

    public void delete(String id) throws SQLException, ClassNotFoundException;

    public String newId() throws SQLException, ClassNotFoundException;

    public ArrayList<String> getAllId() throws SQLException, ClassNotFoundException;

    public T search(String newValue) throws SQLException, ClassNotFoundException;
}
