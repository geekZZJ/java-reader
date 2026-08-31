package com.example.reader.service;

import com.example.reader.entity.Member;

public interface MemberService {
    public Member createMember(String username, String password, String nickname);

    public Member checkLogin(String username, String password);
}
