package com_korit.kor_it_gov_spring_boot.Service;

import com_korit.kor_it_gov_spring_boot.Dto.AddMemberReqDto;
import com_korit.kor_it_gov_spring_boot.Entity.Member;
import com_korit.kor_it_gov_spring_boot.Repository.MemberRepository;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor

public class MemberService {
    private static MemberService instance;
    private MemberRepository memberRepository;
    private MemberService (){
        memberRepository = MemberRepository.getInstance();
    }

    public static MemberService getInstance() {
        if (instance == null) {
            instance = new MemberService();
        }
        return instance;
    }
    public boolean isDuplicateName(String name){
        Member member = memberRepository.findMemberByName(name);
        return member != null;

        }

        public void addMember(AddMemberReqDto addMemberReqDto){
        memberRepository.addMember(addMemberReqDto.toEntity());
        }

        public List<Member> getMemberAll(){
        return memberRepository.getMemberAll();
        }

    }