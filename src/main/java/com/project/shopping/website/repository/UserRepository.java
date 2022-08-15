//package com.project.shopping.website.repository;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import com.project.shopping.website.entity.User;
//
//
//
//@Repository
//public interface UserRepository extends JpaRepository<User, Long> {
//	public List<User> findAllByUsername(String username);
//	   public User findByUsernameAndEmail(String username, String email);
//	
//	Optional<User> findByUsername(String username);
//
//	Boolean existsByUsername(String username);
//
//	Boolean existsByEmail(String email);
//}
