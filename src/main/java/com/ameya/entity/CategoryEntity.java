package com.ameya.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Categories")
public class CategoryEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CatID")
	int CatID;
	
	@Column(name="Cat_Name")
	String Cat_Name;
	
	@Column(name="Cat_Desc")
	String Cat_Desc;
	
	@Column(name="Cat_ParentID")
	int Cat_ParentID;
	
	@Column(name="Cat_isDeleted")
	int Cat_isDeleted;
	
	@Column(name="Cat_Img")
	String Cat_Img;
	
	@Column(name="Cat_Create_Date")
	Date Cat_Create_Date;
	
	@Column(name="Cat_Update_Date")
	Date Cat_Update_Date;
	
	@Column(name="Cat_Updated_By")
	String Cat_Updated_By;

	public int getCatID() {
		return CatID;
	}

	public void setCatID(int catID) {
		CatID = catID;
	}

	public String getCat_Name() {
		return Cat_Name;
	}

	public void setCat_Name(String cat_Name) {
		Cat_Name = cat_Name;
	}

	public String getCat_Desc() {
		return Cat_Desc;
	}

	public void setCat_Desc(String cat_Desc) {
		Cat_Desc = cat_Desc;
	}

	public int getCat_ParentID() {
		return Cat_ParentID;
	}

	public void setCat_ParentID(int cat_ParentID) {
		Cat_ParentID = cat_ParentID;
	}

	public int getCat_isDeleted() {
		return Cat_isDeleted;
	}

	public void setCat_isDeleted(int cat_isDeleted) {
		Cat_isDeleted = cat_isDeleted;
	}

	public String getCat_Img() {
		return Cat_Img;
	}

	public void setCat_Img(String cat_Img) {
		Cat_Img = cat_Img;
	}

	public Date getCat_Create_Date() {
		return Cat_Create_Date;
	}

	public void setCat_Create_Date(Date cat_Create_Date) {
		Cat_Create_Date = cat_Create_Date;
	}

	public Date getCat_Update_Date() {
		return Cat_Update_Date;
	}

	public void setCat_Update_Date(Date cat_Update_Date) {
		Cat_Update_Date = cat_Update_Date;
	}

	public String getCat_Updated_By() {
		return Cat_Updated_By;
	}

	public void setCat_Updated_By(String cat_Updated_By) {
		Cat_Updated_By = cat_Updated_By;
	}
	
	

}
