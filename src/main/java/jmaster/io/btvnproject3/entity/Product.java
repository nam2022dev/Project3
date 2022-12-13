package jmaster.io.btvnproject3.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private double price;
    private String description;
    private String image;
    @OneToOne
    private Category category;
    @CreatedDate
    @Column(updatable = false)
    private Date createAt;
    @LastModifiedDate
    private Date lastUpdateAt;
}
