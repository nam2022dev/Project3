package jmaster.io.btvnproject3.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
<<<<<<< HEAD

    private String name;
=======
    @NotBlank
    private String name;
    @CreatedDate
    private Date createAt;
>>>>>>> 35c9486560a7efa41149a3bf0492d5b0ca6d800a
}
