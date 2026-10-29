package dev.java10x.customermanagement.plans;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("plans")
public class PlanController {

    @GetMapping("/all")
    public String showAllPlans() {
        return "Plans listed successfully";
    }

    @PostMapping("/create")
    public String createPlan() {
        return "Plan created!";
    }

    @PutMapping("/update")
    public String updatePlan() {
        return "Plan update!";
    }

    @DeleteMapping("/deletar")
    public String deletePlan() {
        return "Plan deleted";
    }

}
