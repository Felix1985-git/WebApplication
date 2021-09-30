package com.example.kuzmichevjsp.dao.JPA;


import com.example.kuzmichevjsp.entity.Plane;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaneDaoJPA extends CrudRepository<Plane, Integer> {
}
