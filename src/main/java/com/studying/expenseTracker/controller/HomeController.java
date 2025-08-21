package com.studying.expenseTracker.controller;

import com.studying.expenseTracker.model.AppUser;
import com.studying.expenseTracker.model.Category;
import com.studying.expenseTracker.model.Expense;
import com.studying.expenseTracker.service.ServiceManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/expense-tracker")
public class HomeController {

    // http://localhost:8080/expense-tracker/home

    @Autowired
    private ServiceManager serviceManager;

    @GetMapping("/home")
    public String getExpenses(Model model){
        List<Expense> expenses = serviceManager.getAllExpenses();
        List<AppUser> appUsers = serviceManager.getAllUsers();
        List<Category> categories = serviceManager.getAllCategories();

        model.addAttribute("expenses", expenses);
        model.addAttribute("appUsers", appUsers);
        model.addAttribute("categories", categories);

        return "home";
    }

}
