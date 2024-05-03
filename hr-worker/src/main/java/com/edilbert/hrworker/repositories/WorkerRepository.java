package com.edilbert.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edilbert.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
