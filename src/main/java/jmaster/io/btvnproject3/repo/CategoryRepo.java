package jmaster.io.btvnproject3.repo;

import jmaster.io.btvnproject3.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface CategoryRepo extends JpaRepository<Category, Integer>, Repository<Category, Integer> {


    Page<Category> findByNameLike(String name, Pageable pageable);

    Page<Category> searchByName(String name, Pageable pageable);
}
