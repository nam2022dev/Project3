package jmaster.io.btvnproject3.service;

import jmaster.io.btvnproject3.DTO.PageDTO;
//import com.codede.project3.entity.UserRole;
import jmaster.io.btvnproject3.repo.UserRepo;
//import com.codede.project3.repo.UserRoleRepo;
import jmaster.io.btvnproject3.DTO.UserDTO;
import jmaster.io.btvnproject3.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.modelmapper.ModelMapper;

import javax.persistence.NoResultException;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;


@Service
public class UserService {

    @Autowired
    UserRepo userRepo;


    @Transactional
    @CacheEvict(cacheNames = "category-search", allEntries = true)
    public void create(UserDTO userDTO) {
        User user = new ModelMapper().map(userDTO, User.class);
        userRepo.save(user);
    }

    @Transactional
    @Cacheable(cacheNames = "categories", key = "#id")
    public void update(UserDTO userDTO) {
        User user = userRepo.findById(userDTO.getId()).orElseThrow(RuntimeException::new);

        user.setEmail(userDTO.getEmail());
        user.setBirthdate(userDTO.getBirthdate());
        user.setName(userDTO.getName());
        user.setAvatar(userDTO.getAvatar());
        user.setUsername(userDTO.getUsername());
        user.setPassword(userDTO.getPassword());

        userRepo.save(user);
    }

    @Transactional
    public UserDTO getById(int id) {
        User user = userRepo.findById(id).orElseThrow(NoResultException::new);

        UserDTO userDTO = new ModelMapper().map(user, UserDTO.class);
        return userDTO;
    }

    @Transactional
    public PageDTO<UserDTO> getAll() {
        List<UserDTO> list = new ArrayList<>();
        PageDTO<UserDTO> pageDTO = new PageDTO<>();
        User user = new User();

        for (User u : userRepo.findAll()
        ) {
            ModelMapper mapper = new ModelMapper();
            UserDTO userDTO = mapper.map(u, UserDTO.class);
            list.add(userDTO);
        }
        pageDTO.setContents(list);
        return pageDTO;
    }

    public void delete(int id) {
        userRepo.deleteById(id);
    }

    @Transactional
    public PageDTO<UserDTO> searchByName(String name, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);

        Page<User> pageRS = userRepo.findByNameLikeIgnoreCase(name, pageable);

        PageDTO<UserDTO> pageDTO = new PageDTO<>();

        List<UserDTO> list = new ArrayList<>();
        for (User user : pageRS) {
            list.add(new ModelMapper().map(user, UserDTO.class));
        }

        pageDTO.setContents(list);
        return pageDTO;
    }

    @Transactional
    public PageDTO<UserDTO> searchByBirthdate(ZonedDateTime birthdate, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);

        Page<User> pageRS = userRepo.findByBirthdate(birthdate, pageable);

        PageDTO<UserDTO> pageDTO = new PageDTO<>();

        List<UserDTO> list = new ArrayList<>();
        for (User user : pageRS) {
            list.add(new ModelMapper().map(user, UserDTO.class));
        }

        pageDTO.setContents(list);
        return pageDTO;
    }
}
