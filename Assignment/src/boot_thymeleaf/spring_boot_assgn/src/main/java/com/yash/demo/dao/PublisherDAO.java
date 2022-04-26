package com.yash.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.jdbc.core.RowMapper;

import com.yash.demo.model.Publisher;

import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
 @Component
public class PublisherDAO {

	 @Autowired
	  JdbcTemplate jdbc;
	public int addPublisher(Publisher objpub)
	{
		if(jdbc!=null)
		{
		int rcount;
		rcount= jdbc.update("insert into publisher (pname,pemail,address) values(?,?,?)",objpub.getPname(),objpub.getPemail(),objpub.getAddress());
		return rcount;
		}
		return 0;
	}
	public List<Publisher> getAllpublisher()
	{
		return jdbc.query("select * from publisher", new RowMapper<Publisher>() {
			public Publisher mapRow(ResultSet rs,int rowno) throws SQLException
			{
				Publisher objp = new Publisher();
				objp.setPubid(rs.getInt("pubid"));
				objp.setPname(rs.getString("pname"));
			
				objp.setPemail(rs.getString("pemail"));
				objp.setAddress(rs.getString("address"));
				
				 
				return objp;
			}
		});		
	}
}