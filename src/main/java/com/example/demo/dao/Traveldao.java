package com.example.demo.dao;

import com.example.demo.model.Member;
import com.example.demo.model.Travel;

import java.util.List;

public interface Traveldao {


    List<Travel> getProducts(String town);

    Member checkMember(Member user);
}
