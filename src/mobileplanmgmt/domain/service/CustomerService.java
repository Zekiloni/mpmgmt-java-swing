/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mobileplanmgmt.domain.service;

import java.util.List;
import mobileplanmgmt.domain.model.Customer;
import mobileplanmgmt.domain.model.CustomerCreate;

/**
 *
 * @author Zekiloni
 */
public interface CustomerService {
    Customer create(CustomerCreate customerCreate);
    void delete(Long customerId);
    Customer update(Customer customer);
    Customer getById(Long customerId);
    List<Customer> getAll();
}
