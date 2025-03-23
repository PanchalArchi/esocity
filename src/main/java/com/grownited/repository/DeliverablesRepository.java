package com.grownited.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grownited.entity.DeliverablesEntity;

@Repository
public interface DeliverablesRepository extends JpaRepository<DeliverablesEntity, Integer>{

}
