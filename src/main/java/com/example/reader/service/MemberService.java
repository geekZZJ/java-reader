package com.example.reader.service;

import com.example.reader.entity.Member;
import com.example.reader.entity.MemberReadState;

public interface MemberService {
    public Member createMember(String username, String password, String nickname);

    public Member checkLogin(String username, String password);

    public MemberReadState selectMemberReadState(Long memberId, Long bookId);
}
