package jmaster.io.btvnproject3.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

/**
 * Bill(id, buyDate, User user)
 */
@Data
@Entity
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private User user;
    @CreatedDate
    @Column(updatable = false)
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private Date createAt;
    @LastModifiedDate
    private Date lastUpdateAt;
}
