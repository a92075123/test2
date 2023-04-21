package com.example.demo.rowmapper;

import com.example.demo.model.Travel;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class TravelRowMapper implements RowMapper<Travel> {

    @Override
    public Travel mapRow(ResultSet rs, int rowNum) throws SQLException {


        Travel travel =new Travel();

        travel.setId(rs.getInt("product_id"));
        travel.setName(rs.getString("name"));
        travel.setTown(rs.getString("town"));
        travel.setAddress(rs.getString("address"));
        travel.setTel(rs.getString("tel"));
        travel.setTickets(rs.getInt("tickets"));
        travel.setIntroduce(rs.getString("introduce"));
        travel.setPicture(rs.getString("picture"));


        return travel ;
    }
}
