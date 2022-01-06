package com.example.swagger.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserReq {
    @ApiModelProperty(value = "사용자이름",example = "steve",required = true)
    private String name;
    @ApiModelProperty(value = "사용자나이",example = "30",required = true)
    private int age;
}
