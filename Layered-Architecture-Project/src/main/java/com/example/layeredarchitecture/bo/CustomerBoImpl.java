package com.example.layeredarchitecture.bo;

import com.example.layeredarchitecture.dao.custom.CustomerDAO;
import com.example.layeredarchitecture.dao.custom.impl.CustomerDAOImpl;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerBoImpl implements CustomerBo{
    CustomerDAO customerDAO = new CustomerDAOImpl();
    public ArrayList<CustomerDTO> getAllCustomer() throws SQLException, ClassNotFoundException {
        return customerDAO.getAll();
    }

    public boolean saveCustomer(CustomerDTO customer) throws SQLException, ClassNotFoundException{
        return customerDAO.save(customer);
    }

    public void updateCustomer(CustomerDTO customer) throws SQLException, ClassNotFoundException{
        customerDAO.update(customer);
    }

    public boolean existCustomer(String id) throws SQLException, ClassNotFoundException{
        return customerDAO.exist(id);
    }

    public void deleteCustomer(String id) throws SQLException, ClassNotFoundException{
        customerDAO.delete(id);
    }

    public String newCustomerId() throws SQLException, ClassNotFoundException{
        return customerDAO.newId();
    }

    public ArrayList<String> getAllCustomerId() throws SQLException, ClassNotFoundException{
        return customerDAO.getAllId();
    }

    public CustomerDTO searchCustomer(String newValue) throws SQLException, ClassNotFoundException{
        return customerDAO.search(newValue);
    }
}
