//package com.codede.project3.service;
//
//import com.codede.project3.DTO.UserDTO;
//import com.codede.project3.DTO.UserRoleDTO;
//import com.codede.project3.entity.User;
//import com.codede.project3.entity.UserRole;
//import com.codede.project3.repo.UserRepo;
//import com.codede.project3.repo.UserRoleRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import javax.persistence.NoResultException;
//
//@Service
//public class UserRoleService {
//    @Autowired
//    UserRoleRepo userRoleRepo;
//
//    @Autowired
//    UserRepo userRepo;
//
//    @Transactional
//    public void create(UserRoleDTO userRoleDTO) {
//        UserRole userRole = new UserRole();
//        userRole.setRole(userRoleDTO.getRole());
//
//        User user = userRepo.findById(userRoleDTO.getUserId()).orElseThrow(NoResultException::new);
//        userRole.setUser(user);
//
//        userRoleRepo.save(userRole);
//    }
//
//    @Transactional
//    public void update(UserDTO userDTO) {
//        User user = userRepo.findById(userDTO.getId())
//                .orElseThrow(NoResultException::new);
//
//        user.setName(userDTO.getName());
//        user.setUsername(userDTO.getUsername());
//        user.setEmail(userDTO.getEmail());
//
//
//        userRepo.save(user);
//    }
//}
