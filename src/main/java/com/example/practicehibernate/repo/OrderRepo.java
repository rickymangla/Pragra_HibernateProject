package com.example.practicehibernate.repo;

import com.example.practicehibernate.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository<Orders, Integer> {


}
