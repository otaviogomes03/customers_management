package dev.java10x.customermanagement.customers;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerModel, Long> {

}
