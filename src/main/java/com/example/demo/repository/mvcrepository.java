package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.mvcmodel;

@Repository
public interface mvcrepository extends CrudRepository<mvcmodel, Integer>{

}
