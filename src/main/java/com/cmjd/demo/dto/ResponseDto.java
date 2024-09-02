package com.cmjd.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseDto<T> {

    private String massege;
    private T data;
    
}
