package org.example.controller;

import org.example.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askFullDetails")
    public String employeeData(Model model) {
        model.addAttribute("employee", new Employee());
        return "ask-employee-full-details-view";
    }

    @RequestMapping("/showFullDetails")
    public String showEmployeeDetails(@ModelAttribute("employee") Employee emp) {
        return "show-employee-full-details-view";
    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails() {
        return "show-emp-details-view";
    }

}
