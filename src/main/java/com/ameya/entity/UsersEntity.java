package com.ameya.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class UsersEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="UserID")
	int UserID;
	
	@Column(name="U_Name")
	String U_Name;
	
	@Column(name="U_address")
	String U_address;
	
	@Column(name="U_Permanent_Addr")
	String U_Permanent_Addr;
	
	@Column(name="U_DoB")
	Date U_DoB;

	public int getUserID() {
		return UserID;
	}

	public void setUserID(int userID) {
		UserID = userID;
	}

	public String getU_Name() {
		return U_Name;
	}

	public void setU_Name(String u_Name) {
		U_Name = u_Name;
	}

	public String getU_address() {
		return U_address;
	}

	public void setU_address(String u_address) {
		U_address = u_address;
	}

	public String getU_Permanent_Addr() {
		return U_Permanent_Addr;
	}

	public void setU_Permanent_Addr(String u_Permanent_Addr) {
		U_Permanent_Addr = u_Permanent_Addr;
	}

	public Date getU_DoB() {
		return U_DoB;
	}

	public void setU_DoB(Date u_DoB) {
		U_DoB = u_DoB;
	}

	public UsersEntity(int userID, String u_Name, String u_address, String u_Permanent_Addr, Date u_DoB) {
		UserID = userID;
		U_Name = u_Name;
		U_address = u_address;
		U_Permanent_Addr = u_Permanent_Addr;
		U_DoB = u_DoB;
	}

	
}
