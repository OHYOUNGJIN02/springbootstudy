package com_korit.kor_it_gov_spring_boot.Dto;

import com_korit.kor_it_gov_spring_boot.Entity.Member;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class AddMemberReqDto {
    private String name;
    private int age;

    public Member toEntity(){
        return Member.builder()
                .name(name)
                .age(age)
                .build();
    }
}
