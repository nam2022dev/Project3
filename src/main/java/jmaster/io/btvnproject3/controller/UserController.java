package jmaster.io.btvnproject3.controller;

import jmaster.io.btvnproject3.DTO.PageDTO;
import jmaster.io.btvnproject3.DTO.ResponseDTO;
import jmaster.io.btvnproject3.DTO.UserDTO;
import jmaster.io.btvnproject3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/new")
    public ResponseDTO<UserDTO> add(@RequestBody UserDTO userDTO) {
        userService.create(userDTO);
        return ResponseDTO.<UserDTO>builder().status(200).data(userDTO).build();
    }

    @PutMapping("/edit")
    public ResponseDTO<UserDTO> edit(@RequestBody UserDTO userDTO) {
        userService.update(userDTO);
        return ResponseDTO.<UserDTO>builder().status(200).data(userDTO).build();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") int id) {
        userService.delete(id);
    }

    @GetMapping("/get/{id}")
    public ResponseDTO<UserDTO> getById(@PathVariable("id") int id) {
        return ResponseDTO.<UserDTO>builder().status(200).data(userService.findById(id)).build();
    }

    @GetMapping("/search")
    public ResponseDTO<PageDTO<UserDTO>> searchByName(@RequestParam(name = "name", required = false) String name,
                                                      @RequestParam(name = "page", required = false) Integer page,
                                                      @RequestParam(name = "size", required = false) Integer size) {
        size = size == null ? 10 : size;
        page = page == null ? 0 : page;
        name = name == null ? "" : name;
        Pageable pageable = PageRequest.of(page, size);

        PageDTO<UserDTO> pageRS = userService.searchByName("%" + name + "%", pageable);
        return ResponseDTO.<PageDTO<UserDTO>>builder().status(200).data(pageRS).build();
    }

    @GetMapping("/search")
    public ResponseDTO<PageDTO<UserDTO>> searchByBirthdate(@RequestParam(name = "birthdate", required = false) Date birthdate,
                                                           @RequestParam(name = "page", required = false) Integer page,
                                                           @RequestParam(name = "size", required = false) Integer size) {
        size = size == null ? 10 : size;
        page = page == null ? 0 : page;
//        birthdate = birthdate == null ?  : birthdate;
        Pageable pageable = PageRequest.of(page, size);

        PageDTO<UserDTO> pageRS = userService.searchByBirthdate(birthdate, pageable);
        return ResponseDTO.<PageDTO<UserDTO>>builder().status(200).data(pageRS).build();
    }

}
