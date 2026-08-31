package com.example.reader.service;

import com.example.reader.entity.Evaluation;
import com.example.reader.entity.Member;
import com.example.reader.entity.MemberReadState;

public interface MemberService {
    public Member createMember(String username, String password, String nickname);

    public Member checkLogin(String username, String password);

    public MemberReadState selectMemberReadState(Long memberId, Long bookId);

    public MemberReadState updateMemberReadState(Long memberId, Long bookId, Integer readState);

    public Evaluation evaluate(Long memberId, Long bookId, Integer score, String content);
}
