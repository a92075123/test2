package com.example.demo.controller;


import com.example.demo.model.Member;
import com.example.demo.model.Travel;
import com.example.demo.service.Travelservice;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.catalina.connector.Request;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.io.InputStream;
import java.lang.runtime.ObjectMethods;
import java.util.*;

@Controller
public class IndexController {
        @Autowired
        private Travelservice travelservice;

        @GetMapping("/")
        public String index(){

            return "index";
        }
        @GetMapping("/Member")
        public String Member(){

            return "Member";
         }
         @GetMapping("/memberOK")
         public String memberOK(){

            return "memberOK";
    }

    @GetMapping("/SelectProduct")
    public String getProduct(@RequestParam(required = false)  String town, Model model){
        System.out.println(town);
        List<Travel> travelList= travelservice.getProducts(town);

        model.addAttribute("product",travelList);
        return "SelectProduct";
    }
    @PostMapping("/Member")
    public String checkMember(@RequestBody Member member, Model model , HttpServletResponse response){

            Member user = travelservice.checkMember(member);

            if(user!=null) {
                Cookie cookie =new Cookie("user",user.getUser());
                cookie.setMaxAge(7*24*60*60);
                cookie.setSecure(true);
                response.addCookie(cookie);

                model.addAttribute("user", user.getUser());
                return "memberOK";
            }

        return null;
    }
    @GetMapping("/test")
    public ResponseEntity<?> test(HttpServletRequest request) throws IOException {


        Map<String,String> maps =new HashMap<>();
        maps.put("Member","david");
        maps.put("Member1","david1");
        maps.put("Member2","david2");
        maps.put("passwd","123456789");



       return ResponseEntity.status(HttpStatus.OK).body(maps);

    }
}
