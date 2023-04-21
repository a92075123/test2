package com.example.demo.service;

import com.example.demo.model.Member;
import com.example.demo.model.Travel;

import java.util.List;

public interface Travelservice {

    List<Travel> getProducts(String town);
    Member checkMember(Member user);
}
