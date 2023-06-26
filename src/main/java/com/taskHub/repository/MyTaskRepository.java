package com.taskHub.repository;

import com.taskHub.entity.MyTaskList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyTaskRepository extends JpaRepository <MyTaskList, Integer> {}
