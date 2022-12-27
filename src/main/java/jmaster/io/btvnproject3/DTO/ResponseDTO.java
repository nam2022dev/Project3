package jmaster.io.btvnproject3.DTO;

import lombok.Data;

@Data
public class ResponseDTO<T> {
    private int status;
    private T data;
    private String error;
}
