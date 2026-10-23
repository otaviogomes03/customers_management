package dev.java10x.customermanagement.customers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class CustomerController {

    @GetMapping("/welcome")
    public String welcome() {
        return "This is the first message on this route.";
    }

    // Adicionar cliente (CREATE)
    @PostMapping("/create")
    public String createCustomer() {
        return "Customer created!";
    }
    // Mostrar todos os clientes (READ)
    @GetMapping("/all")
    public String showAllCustomers() {
        return "Show customer";
    }
    // Mostrar cliente por id (READ)
    @GetMapping("/allID")
    public String showAllCustomersById() {
        return "Show customer by id";
    }
    // Alterar dados dos clientes (UPDATE)
    @PutMapping("/updateID")
    public String updateCustomerById() {
        return "Update customer by id";
    }
    // Deletar clientes (DELETE)
    @DeleteMapping("/deleteID")
    public String deleteCustomerById() {
        return "Delete customer by id";
    }
}
