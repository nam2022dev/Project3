package jmaster.io.btvnproject3.DTO;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jmaster.io.btvnproject3.entity.User;
import lombok.Data;

import javax.persistence.ManyToOne;

@Data
public class UserRoleDTO {
    private Integer id;
    private Integer userId;
    private String role;
}
