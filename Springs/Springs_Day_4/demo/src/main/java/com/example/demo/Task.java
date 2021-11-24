package com.example.demo;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Task {
	private int taskid;
	private String taskname;
	private String desc;
	
	public String getTaskname() {
		return taskname;
	}
	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getTaskid() {
		return taskid;
	}
	public void setTaskid(int taskid) {
		this.taskid = taskid;
	}
	
		
}
