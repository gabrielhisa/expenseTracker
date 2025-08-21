package com.studying.expenseTracker.service;

import com.studying.expenseTracker.model.AppUser;
import com.studying.expenseTracker.model.Category;
import com.studying.expenseTracker.model.Expense;
import com.studying.expenseTracker.repository.AppUserRepository;
import com.studying.expenseTracker.repository.CategoryRepository;
import com.studying.expenseTracker.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceManager {

    @Autowired
    private ExpenseRepository expenseRepository;

    @Autowired
    private AppUserRepository appUserRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    public ServiceManager(){
    }

    public List<Expense> getAllExpenses(){
        return expenseRepository.findAll();
    }

    public List<AppUser> getAllUsers(){
        return appUserRepository.findAll();
    }

    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }


}
