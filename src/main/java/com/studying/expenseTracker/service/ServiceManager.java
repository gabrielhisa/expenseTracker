package com.studying.expenseTracker.service;

import com.studying.expenseTracker.model.Expense;
import com.studying.expenseTracker.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceManager {

    @Autowired
    private ExpenseRepository expenseRepository;

    @Autowired
    public ServiceManager(){
    }

    public List<Expense> getAllExpenses(){
        return expenseRepository.findAll();
    }


}
