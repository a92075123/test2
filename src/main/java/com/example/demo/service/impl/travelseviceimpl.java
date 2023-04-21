package com.example.demo.service.impl;

import com.example.demo.dao.Traveldao;
import com.example.demo.model.Member;
import com.example.demo.model.Travel;
import com.example.demo.service.Travelservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class travelseviceimpl implements Travelservice {
    @Autowired
    private  Traveldao traveldao ;
    @Override
    public List<Travel> getProducts(String town) {
//        System.out.println(town+"2");
        List<Travel> travelList = traveldao.getProducts(town);

        return travelList;
    }

    public Member checkMember(Member member){

        Member user = traveldao.checkMember(member);

        return user ;
    }
}
