package com.yash.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.jdbc.core.RowMapper;

import com.yash.demo.model.Booktitle;

import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
 @Component
public class BooktitleDAO {

	 @Autowired
	  JdbcTemplate jdbc;
	public int addBooktitle(Booktitle objbook)
	{
		if(jdbc!=null)
		{
		int rcount;
		rcount= jdbc.update("insert into booktitle (title,auid1,auid2,auid3,pubid,price) values(?,?,?,?,?,?)",objbook.getTitle(),objbook.getAuid1(),objbook.getAuid2(),objbook.getAuid3(),objbook.getPubid(),objbook.getPrice());
		return rcount;
		}
		return 0;
	}
	public List<Booktitle> getAllbooktitle()
	{
		return jdbc.query("select * from booktitle", new RowMapper<Booktitle>() {
			public Booktitle mapRow(ResultSet rs,int rowno) throws SQLException
			{
				Booktitle objb = new Booktitle();
				objb.setBtid(rs.getInt("btid"));
				objb.setTitle(rs.getString("title"));
			
				objb.setAuid1(rs.getInt("auid1"));
				objb.setAuid2(rs.getInt("auid2"));
				objb.setAuid3(rs.getInt("auid3"));
				objb.setPubid(rs.getInt("pubid"));
				objb.setPrice(rs.getInt("price"));
				 
				return objb;
			}
		});		
	}
}