package com.studying.expenseTracker.repository;

import com.studying.expenseTracker.model.AppUser;
import com.studying.expenseTracker.model.Category;
import com.studying.expenseTracker.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {

    List<Expense> findByUserAndCategory(AppUser appUser, Optional<Category> category);


}
