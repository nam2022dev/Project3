package jmaster.io.btvnproject3.repo;

import jmaster.io.btvnproject3.DTO.UserDTO;
import jmaster.io.btvnproject3.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.time.ZonedDateTime;

public interface UserRepo extends JpaRepository<User, Integer>, Repository<User, Integer> {
    Page<User> findByNameLikeIgnoreCase(String name, Pageable pageable);

    Page<User> findByBirthdate(ZonedDateTime birthdate, Pageable pageable);

}
