package jmaster.io.btvnproject3.controller;

import jmaster.io.btvnproject3.DTO.ResponseDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.persistence.NoResultException;

@RestControllerAdvice(basePackages = "jmaster.io.btvnproject3.controller")
public class ExceptionController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @ExceptionHandler({NoResultException.class})
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    public ResponseDTO<Void> noResult(NoResultException ex) {
        logger.info("sql ex : ", ex);
        return ResponseDTO.<Void>builder().status(404).error("Not found").build();
    }

    @ExceptionHandler({Exception.class})
    @ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseDTO<Void> exception(Exception ex) {
        logger.error("ex : ", ex);
        return ResponseDTO.<Void>builder().status(500).error("Server error").build();
    }
}
