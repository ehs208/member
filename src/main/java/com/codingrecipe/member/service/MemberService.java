package com.codingrecipe.member.service;

import org.springframework.stereotype.Service;
import com.codingrecipe.member.dto.MemberDTO;
import com.codingrecipe.member.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor 
@Service
public class MemberService {
    private final MemberRepository memberRepository;
    
    public void save(MemberDTO memberDTO) {
    }
}


