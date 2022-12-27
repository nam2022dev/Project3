package jmaster.io.btvnproject3.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Data
public class UserDTO {
    private Integer id;
    private String name;
    private String username;
    private String password;
    private String avatar;

    @JsonFormat(pattern = "dd/MM/yyyy")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date birthdate;
    private String roles;
    private String email;
    private List<UserRoleDTO> userRoles;
}
