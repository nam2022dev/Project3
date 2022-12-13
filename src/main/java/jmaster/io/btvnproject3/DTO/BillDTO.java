package jmaster.io.btvnproject3.DTO;

import jmaster.io.btvnproject3.entity.User;
import lombok.Data;
import java.util.Date;

@Data
public class BillDTO {
    private Integer id;
    private Date buyDate;
    private User user;
}
