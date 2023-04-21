package com.example.demo.dao.impl;

import com.example.demo.dao.Traveldao;
import com.example.demo.model.Member;
import com.example.demo.model.Travel;
import com.example.demo.rowmapper.CheckMemberRowMapper;
import com.example.demo.rowmapper.TravelRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Component
public class Traveldaoimpl implements Traveldao {
    @Autowired
    private   NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    @Override
    public List<Travel> getProducts(String town) {
//        System.out.println(town+"3");
        String sql = "SELECT product_id,name,town,address,tel,tickets,introduce,picture FROM travel2 WHERE town= :town";
        Map<String, String> map =new HashMap<>();
        map.put("town",town);

        List<Travel> travelList =namedParameterJdbcTemplate.query(sql,map,new TravelRowMapper());


        if(travelList!=null){
            return travelList;
        }
        return null;
    }

    @Override
    public Member checkMember(Member user)  {

        String sql = "SELECT email , password FROM member WHERE email= :email and password= :password";
        Map<String,String> map =new HashMap<>();
        map.put("email",user.getUser());
        map.put("password", user.getPassword());
        List<Member> checkUser =  namedParameterJdbcTemplate.query(sql,map,new CheckMemberRowMapper());

        if (checkUser!=null) {
            return checkUser.get(0);
        }else {
            return null;
        }

    }

}
