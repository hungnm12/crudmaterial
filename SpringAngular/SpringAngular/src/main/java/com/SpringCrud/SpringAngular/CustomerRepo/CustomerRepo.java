package com.SpringCrud.SpringAngular.CustomerRepo;

import com.SpringCrud.SpringAngular.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;




@EnableJpaRepositories
@Repository
//Mark class as repository served the I/O of the data
//Call Entity and the primary key
//Mark Customer Repo as a Bean use to connect with database
//Whenever call is made to CustomerRepo, methods from JPARepository can be called for using too as CustomerRepo Inherits JpaRepository
public interface CustomerRepo extends JpaRepository<Customer,Integer> {



}
