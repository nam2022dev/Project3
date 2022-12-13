package jmaster.io.btvnproject3.DTO;

import lombok.Data;

@Data
public class UserDTO {
    private Integer id;
    private String name;
    private String username;
    private String password;
    private String roles;
    private String email;
}
