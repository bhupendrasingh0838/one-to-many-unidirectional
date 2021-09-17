package com.bhup3.onetomany.Repository;

import com.bhup3.onetomany.Entity.Laptop;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends CrudRepository<Laptop, Long> {
}
