package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

//@RequestMapping(value ="/Pavel")
//@RequestMapping("/Pavel")
@Controller
public class MyController {
    //    @RequestMapping(value ="/")
    @GetMapping("/")
    public String showFirstView() {
        return "first-view";
    }


    @GetMapping("/askDetails")
    public String askEmployeeDetails() {
        return "ask-emp-details-view";
    }

//    @GetMapping("/showDetails")
//    public String showEmployeeDetails() {
//        return "show-emp-details-view";
//    }

    //    @GetMapping("/showDetails")
//    public String showEmployeeDetails(HttpServletRequest request, Model model) {
//        String empName = request.getParameter("employeeName");
//        empName = "Mr." + empName;
//        model.addAttribute("nameAttribute", empName);
//        model.addAttribute("secondName", "Ivanov");
//    return "show-emp-details-view";
//    }
    @GetMapping("/showDetails")
    public String showEmployeeDetails(@RequestParam("employeeName") String empName, Model model) {
        empName = "Mr." + empName;
        model.addAttribute("nameAttribute", empName);
        model.addAttribute("secondName", "Ivanov");
        return "show-emp-details-view";
    }

}
