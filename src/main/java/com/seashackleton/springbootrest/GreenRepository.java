package com.seashackleton.springbootrest;

import org.springframework.data.repository.CrudRepository;
import com.seashackleton.springbootrest.Green;

public interface GreenRepository extends CrudRepository<Green, Integer> {
}
