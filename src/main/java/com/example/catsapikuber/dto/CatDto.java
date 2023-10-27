package com.example.catsapikuber.dto;

import java.time.LocalDate;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CatDto {
    private String name;
    private LocalDate birthDay;
}
