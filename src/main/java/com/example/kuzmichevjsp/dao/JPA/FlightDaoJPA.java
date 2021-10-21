package com.example.kuzmichevjsp.dao.JPA;

import com.example.kuzmichevjsp.entity.Flight;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightDaoJPA extends PagingAndSortingRepository<Flight, Integer> {

}
