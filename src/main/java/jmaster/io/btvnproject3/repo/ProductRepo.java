package jmaster.io.btvnproject3.repo;

import jmaster.io.btvnproject3.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
