package com.spring.jdbc.Dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entities.Student;

public class studentDaoimpl implements StudentDao {

	
	private JdbcTemplate jdbctemplate;
	
	public int insert(Student student) {
		
		String query="insert into student(id,name,city) values(?,?,?)";
		
		int r=this.jdbctemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
	
	
	
	




}
