package com.example.demo.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Task;
import com.example.demo.TaskDao;
@Component
public class TaskDaoImpl implements TaskDao {
	@Autowired
	DbConnection db;

	int row = 0;

	@Autowired
	Task task = null;



	@Override
	public int save(Object object) {

	try {
	task = (Task) object;
	PreparedStatement ps = db.getConnection().prepareStatement("Insert into task values(?,?,?,?,?,?,?,?,?,?,?)");
	ps.setInt(1, task.getTaskID());
	ps.setInt(2, task.getOwnerID());
	ps.setInt(3, task.getCreatorID());
	ps.setString(4, task.getName());
	ps.setString(5, task.getDescription());
	ps.setString(6, task.getStatus());
	ps.setString(7, task.getPriority());
	ps.setString(8, task.getNotes());
	ps.setBoolean(9, task.getIsBookmarked());
	ps.setString(10, task.getCreatedOn());
	ps.setString(11, task.getStatusChangedOn());
	row = ps.executeUpdate();
	db.closeConnection();
	}catch(SQLException e) {System.out.println(e);}

	return row;
	}
	
	

}
