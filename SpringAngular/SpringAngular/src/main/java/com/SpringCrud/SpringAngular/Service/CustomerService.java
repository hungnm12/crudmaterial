package com.SpringCrud.SpringAngular.Service;

import com.SpringCrud.SpringAngular.DTO.CustomerDTO;
import com.SpringCrud.SpringAngular.DTO.CustomerSaveDTO;
import com.SpringCrud.SpringAngular.DTO.CustomerUpdateDTO;

import java.util.List;



public interface CustomerService {
    String addCustomer(CustomerSaveDTO customerSaveDTO);


    List<CustomerDTO> getAllCustomer();

    String updateCustomers(CustomerUpdateDTO customerUpdateDTO);

    boolean deleteCustomer(int id);
}


