package jmaster.io.btvnproject3.repo;

import jmaster.io.btvnproject3.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
