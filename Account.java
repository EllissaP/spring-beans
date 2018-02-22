package Beans;

import java.util.Date;

public class Account 
{
	private long id;
	private String employeeName;
	private int yearsOfExperience;
	private Date accessTime;
	
	public Account()
	{
		
	}
	
	public Account(long id, String employeeName, int yearsOfExperience)
	{
		this.id = id;
		this.employeeName = employeeName;
		this.yearsOfExperience = yearsOfExperience;
	}
	
	public long getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getEmployeeName()
	{
		return employeeName;
	}
	
	public void setEmployeeName(String employeeName)
	{
		this.employeeName = employeeName;
	}
	
	public int getYearsOfExperience()
	{
		return yearsOfExperience;
	}
	
	public void setYearsOfExperience(int yearsOfExperience)
	{
		this.yearsOfExperience = yearsOfExperience;
	}
	
	public Date getAccessTime()
	{
		return accessTime;
	}
	
	public void setAccessTime(Date accessTime)
	{
		this.accessTime = accessTime;
	}
}
