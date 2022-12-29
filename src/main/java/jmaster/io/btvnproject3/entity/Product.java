package jmaster.io.btvnproject3.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
<<<<<<< HEAD
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
=======
import org.springframework.web.multipart.MultipartFile;
>>>>>>> 35c9486560a7efa41149a3bf0492d5b0ca6d800a

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    private String name;
    private String image;
    private String description;
<<<<<<< HEAD
    private double price;
    @CreatedDate
    @Column(updatable = false)
    private Date createAt;
    @OneToOne
    private Category category;

=======

    @JsonIgnore
    @Transient
    private MultipartFile file;
    @CreatedDate
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private Date createAt;
    @OneToOne
    private Category category;
>>>>>>> 35c9486560a7efa41149a3bf0492d5b0ca6d800a
}
