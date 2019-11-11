package com.karen.test2.model.dao.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karen.test2.model.dao.MyEntity;

public interface MyEntityRepository extends JpaRepository<MyEntity, Long>{

}
