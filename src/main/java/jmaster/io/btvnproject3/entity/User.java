package jmaster.io.btvnproject3.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * User (id, name, username, password, roles, email) - roles : dùng collectiontables one to many
 */
@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    private String avatar;
    @Column(unique = true)
    private String username;
    private String password;
    private String email;

    @JsonFormat(pattern = "dd/MM/yyyy")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date birthdate;

    @JsonIgnore
    @Transient
    private MultipartFile file;

    @CreatedDate
    private Date createAt;

    @JsonManagedReference
    @OneToMany(mappedBy = "user",
            fetch = FetchType.EAGER)
    private List<UserRole> userRoles;
}

