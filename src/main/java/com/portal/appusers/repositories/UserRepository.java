package com.portal.appusers.repositories;

import com.portal.appusers.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

//@RepositoryRestResource
public interface UserRepository extends JpaRepository<User,Long> {

}
