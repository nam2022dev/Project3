package jmaster.io.btvnproject3.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

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
    @Column(unique = true)
    private String username;
    private String password;
    private String roles;
    private String email;
    @CreatedDate
    @Column(updatable = false)
    private Date createAt;
    @LastModifiedDate
    private Date lastUpdateAt;
}

