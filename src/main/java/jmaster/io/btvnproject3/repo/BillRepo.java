package jmaster.io.btvnproject3.repo;

import jmaster.io.btvnproject3.entity.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepo extends JpaRepository<Bill, Integer> {

}
