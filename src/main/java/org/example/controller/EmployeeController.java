package org.example.controller;


import jakarta.validation.Valid;
import org.example.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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

    @PostMapping("/showFullDetails")
    public String showEmployeeDetails( @ModelAttribute("employee") @Valid Employee emp,
                                       BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "ask-employee-full-details-view";
        }else {
            return "show-employee-full-details-view";
        }
    }

}
