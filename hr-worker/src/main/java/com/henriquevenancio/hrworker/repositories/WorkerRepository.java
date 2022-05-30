package com.henriquevenancio.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henriquevenancio.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
