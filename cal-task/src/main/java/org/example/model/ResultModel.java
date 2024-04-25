package org.example.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResultModel {
    private String code;
    private String message;
    private Object data;
}
