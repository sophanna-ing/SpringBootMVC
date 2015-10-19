package com.sop.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.sop.model.User;

@Transactional
public interface UserDao extends CrudRepository<User, Long> {

  /**
   * This method will find an User instance in the database by its email.
   * Note that this method is not implemented and its working code will be
   * Automatically generated from its signature by Spring Data JPA.
   */
  public User findByEmail(String email);

}