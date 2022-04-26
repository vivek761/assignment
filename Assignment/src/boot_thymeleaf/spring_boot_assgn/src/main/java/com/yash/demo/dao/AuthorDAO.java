package com.yash.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.jdbc.core.RowMapper;

import com.yash.demo.model.Author;

import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
 @Component
public class AuthorDAO {

	 @Autowired
	  JdbcTemplate jdbc;
	 
	 
	public JdbcTemplate getJdbc() {
		return jdbc;
	}
	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}
	public int addAuthor(Author objauthor)
	{
		if(jdbc!=null)
		{
		int rcount;
		rcount= jdbc.update("insert into author (auname,auemail) values(?,?)",objauthor.getAuname(),objauthor.getAuemail());
		return rcount;
		}
		return 0;
	}
	public List<Author> getAllAuthor()
	{
		return jdbc.query("select * from author", new RowMapper<Author>() {
			public Author mapRow(ResultSet rs,int rowno) throws SQLException
			{
				Author obju = new Author();
				obju.setAuid(rs.getInt("auid"));
				obju.setAuname(rs.getString("auname"));
			
				obju.setAuemail(rs.getString("auemail"));
				 
				return obju;
			}
		});		
	}

	public int editAuthor(Author objA)
	{
	int rcount;
	rcount= jdbc.update("update author set auname=?, auemail=? where auid=?",objA.getAuname(),objA.getAuemail(),objA.getAuid());
	return rcount;
    }
	public int deleteAuthor(Author objA)
	{
		int rcount;
		rcount= jdbc.update("delete from author where auid=?",objA.getAuid());
		return rcount;
	}
	
	}
