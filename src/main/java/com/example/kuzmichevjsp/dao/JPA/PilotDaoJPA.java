package com.example.kuzmichevjsp.dao.JPA;

import com.example.kuzmichevjsp.entity.Pilot;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PilotDaoJPA extends CrudRepository<Pilot, Integer> {
}
