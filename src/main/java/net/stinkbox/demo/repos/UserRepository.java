package net.stinkbox.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import net.stinkbox.demo.dao.User;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<User, Long> {

}
