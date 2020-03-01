package com.app.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.EmployeeEntity;

public interface EmployeeDaoI extends JpaRepository<EmployeeEntity, Serializable>{

}
