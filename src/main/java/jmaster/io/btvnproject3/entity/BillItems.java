package jmaster.io.btvnproject3.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

/**
 * BillItems (id, Bill , Product , quantity, buyPrice) - mỗi billitem thuộc về 1 bill và 1 product
 */
@Data
@Entity
public class BillItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    private Bill bill;
    @OneToOne
    private Product product;
    private int quantity;
    protected double buyPrice;
    @CreatedDate
    @Column(updatable = false)
    private Date createAt;
    @LastModifiedDate
    private Date lastUpdateAt;
}
