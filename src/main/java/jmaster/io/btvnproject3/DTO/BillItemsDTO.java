package jmaster.io.btvnproject3.DTO;

import jmaster.io.btvnproject3.entity.Bill;
import jmaster.io.btvnproject3.entity.Product;
import lombok.Data;

@Data
public class BillItemsDTO {
    private Integer id;
    private Bill bill;
    private Product product;
    private int quantity;
    protected double buyPrice;
}
