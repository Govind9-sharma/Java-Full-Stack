package com.jdbc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jdbc.entity.Question;

@Repository
public interface QuestionRepository extends CrudRepository<Question,Integer>{
	
}
