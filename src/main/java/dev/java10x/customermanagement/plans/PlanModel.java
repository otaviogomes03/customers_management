package dev.java10x.customermanagement.plans;

import dev.java10x.customermanagement.customers.CustomerModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_plan")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlanModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double value;
    @OneToMany(mappedBy = "plan")
    private List<CustomerModel> customers;

}
