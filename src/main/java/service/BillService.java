package service;

import jmaster.io.btvnproject3.repo.BillRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillService {

    @Autowired
    BillRepo billRepo;
}
