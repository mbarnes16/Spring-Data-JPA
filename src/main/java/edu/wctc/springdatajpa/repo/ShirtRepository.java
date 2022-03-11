
package edu.wctc.springdatajpa.repo;

import edu.wctc.springdatajpa.entity.Shirt;
import org.springframework.data.repository.CrudRepository;

public interface ShirtRepository extends CrudRepository<Shirt, Integer> {

}