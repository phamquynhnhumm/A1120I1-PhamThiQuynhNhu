package buoi_10_4.service;

import buoi_10_4.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    void save(Customer  customer);
    Customer findById(int id);
    void updata( int id, Customer customer);
    void remove( int id);
}