package com.dcn.aaserver.domain.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Data
public class UserDto {

    private Long id;
    @NotNull
    private String username;
    private String fullName;
    private String email;
    private String language;
    private String telephone;
}
