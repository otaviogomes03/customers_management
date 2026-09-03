package dev.java10x.customermanagement.plans;

import dev.java10x.customermanagement.customers.CustomerModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_plan")
public class PlanModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double value;
    @OneToMany(mappedBy = "plan")
    private List<CustomerModel> customers;

    public PlanModel() {
    }

    public PlanModel(Long id, String name, double value, List<CustomerModel> customers) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.customers = customers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public List<CustomerModel> getCustomers() {
        return customers;
    }
}
