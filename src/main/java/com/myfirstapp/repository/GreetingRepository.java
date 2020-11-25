package com.myfirstapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.myfirstapp.model.Greeting;

public interface GreetingRepository extends JpaRepository<Greeting, Long>{
}
