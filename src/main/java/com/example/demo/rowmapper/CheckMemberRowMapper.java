package com.example.demo.rowmapper;

import com.example.demo.model.Member;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CheckMemberRowMapper implements RowMapper<Member> {
    @Override
    public Member mapRow(ResultSet rs, int rowNum) throws SQLException {

        Member member = new Member();
        member.setUser(rs.getString("email"));
        member.setPassword(rs.getString("password"));

        return member;
    }
}
