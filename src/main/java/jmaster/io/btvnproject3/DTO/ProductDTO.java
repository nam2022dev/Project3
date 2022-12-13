package jmaster.io.btvnproject3.DTO;

import jmaster.io.btvnproject3.entity.Category;
import lombok.Data;

@Data
public class ProductDTO {
    private Integer id;
    private String name;
    private double price;
    private String description;
    private String image;
    private Category category;
}
