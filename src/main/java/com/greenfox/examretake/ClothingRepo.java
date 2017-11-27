package com.greenfox.examretake;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClothingRepo extends CrudRepository <Clothing,String> {

    List <Clothing> findAllByNameIsLike(String name);
}
