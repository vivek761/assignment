package com.yash.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.yash.student.Student;
public class StudentDAO {
	JdbcTemplate objJDBC;

	public JdbcTemplate getObjJDBC() {
		return objJDBC;
	}

	public void setObjJDBC(JdbcTemplate objJDBC) {
		this.objJDBC = objJDBC;
	}
	
	public int saveStud(Student objS)
	{
		String query ="insert into student (f_name,l_name,father_name,mother_name,class_name,section,dob,admission_date,gender,add1,add2,city_id,s_phone,p_phone,p_email) values ('"+objS.getF_name()+"','"+objS.getL_name()+"','"+objS.getFather_name()+"','"+objS.getMother_name()+"','"+objS.getClass_name()+"','"+objS.getSection()+"','"+objS.getDob()+"','"+objS.getAdmission_date()+"','"+objS.getGender()+"','"+objS.getAdd1()+"','"+objS.getAdd2()+"',"+objS.getCity_id()+","+objS.getS_phone()+","+objS.getP_phone()+",'"+objS.getP_email()+"')";
		int no;
		no = objJDBC.update(query);
		return no;
	}
	public int updateStud(Student objS)
	{
		String query="update student set f_name='"+objS.getF_name()+"',l_name='"+objS.getL_name()+"',father_name='"+objS.getFather_name()+"',mother_name='"+objS.getMother_name()+"',class_name='"+objS.getClass_name()+"',section='"+objS.getSection()+"',dob='"+objS.getDob()+"',admission_date='"+objS.getAdmission_date()+"',gender='"+objS.getGender()+"',add1='"+objS.getAdd1()+"',add2='"+objS.getAdd2()+"',city_id="+objS.getCity_id()+",s_phone="+objS.getS_phone()+",p_phone="+objS.getP_phone()+",p_email='"+objS.getP_email()+"' where s_id="+objS.getS_id();
		int no;
		no =objJDBC.update(query);
		return no;
			
	}
	public int deleteStud(int s_id)
	{
		String query ="delete from student where s_id="+ s_id;
		return objJDBC.update(query);
	}
	
}

