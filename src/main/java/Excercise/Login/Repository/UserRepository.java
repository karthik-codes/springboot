package Excercise.Login.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Excercise.Login.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
