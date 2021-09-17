package com.bhup3.onetomany.Repository;

import com.bhup3.onetomany.Entity.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client ,Long> {
}
