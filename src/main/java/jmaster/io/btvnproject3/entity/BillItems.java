package jmaster.io.btvnproject3.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
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
    @ManyToOne
    private Bill bill;
    @ManyToOne
    private Product product;
    private int quantity;
    protected double price;
    @CreatedDate
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private Date createAt;
}
