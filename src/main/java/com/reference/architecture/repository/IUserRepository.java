package com.reference.architecture.repository;

import com.reference.architecture.entity.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends CrudRepository<User,Integer> {
}
