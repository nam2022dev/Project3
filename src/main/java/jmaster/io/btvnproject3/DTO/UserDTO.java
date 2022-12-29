package jmaster.io.btvnproject3.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotBlank;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.List;

@Data
public class UserDTO {
    private Integer id;

    @NotBlank
    private String name;
    private String username;
    private String password;
    private String email;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date birthdate;

    @JsonIgnore
    private MultipartFile file;
    private String avatar;

    @JsonFormat(pattern = "dd/MM/yyyy")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private String roles;
    private List<UserRoleDTO> userRoles;
}
