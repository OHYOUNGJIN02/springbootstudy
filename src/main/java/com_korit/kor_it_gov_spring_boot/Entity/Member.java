package com_korit.kor_it_gov_spring_boot.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Member {
    private Integer memberId;
    private String name;
    private int age;
}
