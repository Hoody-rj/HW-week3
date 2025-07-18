package com.example.springvalidation.beanvalidation;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Range;
import lombok.Getter;

@Getter
public class SignUpRequestDto {

    @NotBlank
    private String name;

    @NotNull
    @Range(min = 1, max = 120)
    private Integer age;

    //이메일 확인 정규식 추가
    @NotBlank
    @Pattern(regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$",
            message = "이메일 형식을 확인해 주세요!")
    private String email;


}
