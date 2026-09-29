package dev.java10x.customermanagement.customers;

import dev.java10x.customermanagement.plans.PlanModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_customer")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "idade")
    private int idade;

    @Column(unique = true)
    private String email;

    @ManyToOne
    @JoinColumn(name = "plan_id")
    private PlanModel plan;

}
