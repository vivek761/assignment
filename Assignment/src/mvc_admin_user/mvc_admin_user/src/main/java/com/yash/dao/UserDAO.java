package com.yash.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.yash.controller.User;

public class UserDAO {
	@Autowired	
	JdbcTemplate usrjdbc;
	
	public void setusrjdbc(JdbcTemplate usrjdbc) {
	}
	
	public int saveuser(User obju)
	 {
		 String sql="insert into user (fname,lname,email,password,gender,dob,dateofRegstration,sec_question,sec_answer) values(?,?,?,?,?,?,?,?,?)";
		 return usrjdbc.update(sql, obju.getFname(),obju.getLname(),obju.getEmail(),obju.getPassword(),obju.getGender(),obju.getDob(),obju.getDateofRegstration(),obju.getSec_question(),obju.getSec_answer());
	 }
	
	public List<User> getuser()
	{
		return usrjdbc.query("select * from user",new RowMapper <User>() 		{
		  public User mapRow(ResultSet rs,int rowno) throws SQLException
		  {
			  User obju = new User();
			  obju.setUserid(rs.getInt("userid"));
			  obju.setFname(rs.getString("fname"));
			  obju.setLname(rs.getString("lname"));
			  obju.setEmail(rs.getString("email"));
			  obju.setPassword(rs.getString("password"));
			  obju.setGender(rs.getString("gender"));
			  obju.setDob(rs.getString("dob"));
			  obju.setDateofRegstration(rs.getString("dateofRegstration"));
			  obju.setSec_question(rs.getString("sec_question"));
			  obju.setSec_answer(rs.getString("sec_answer"));
			 
			  return obju;
		  }
	  	}  );
	}
	
	public List<User> viewuser(String id)
	{
		return usrjdbc.query("select * from user where userid="+Integer.parseInt(id),new RowMapper <User>() 		{
		  public User mapRow(ResultSet rs,int rowno) throws SQLException
		  {
			  User obju = new User();
			  obju.setUserid(rs.getInt("userid"));
			  obju.setFname(rs.getString("fname"));
			  obju.setLname(rs.getString("lname"));
			  obju.setEmail(rs.getString("email"));
			  obju.setPassword(rs.getString("password"));
			  obju.setGender(rs.getString("gender"));
			  obju.setDob(rs.getString("dob"));
			  obju.setDateofRegstration(rs.getString("dateofRegstration"));
			  obju.setSec_question(rs.getString("sec_question"));
			  obju.setSec_answer(rs.getString("sec_answer"));
			 
			  return obju;
		  }
	  	}  );
	}
	
	 public int deleteuser(String id)
		{
			String query ="delete from user where userid="+Integer.parseInt(id);
			return usrjdbc.update(query);
		}
}
