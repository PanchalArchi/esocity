package com.grownited.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.grownited.entity.VisitorCategoryEntity;



@Repository
public interface VisitorCategoryRepository extends JpaRepository<VisitorCategoryEntity, Integer> {

}
