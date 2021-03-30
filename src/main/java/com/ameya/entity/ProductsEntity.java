package com.ameya.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Products")
public class ProductsEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ProdID")
	int ProdID;
	
	@Column(name="P_Name")
	String P_Name;
	
	@Column(name="P_Desc")
	String P_Desc;
	
	@Column(name="P_Category")
	String P_Category;
	
	@Column(name="P_Price")
	int P_Price;
	
	@Column(name="P_Img")
	String P_Img;

	public int getProdID() {
		return ProdID;
	}

	public void setProdID(int prodID) {
		ProdID = prodID;
	}

	public String getP_Name() {
		return P_Name;
	}

	public void setP_Name(String p_Name) {
		P_Name = p_Name;
	}

	public String getP_Desc() {
		return P_Desc;
	}

	public void setP_Desc(String p_Desc) {
		P_Desc = p_Desc;
	}

	public String getP_Category() {
		return P_Category;
	}

	public void setP_Category(String p_Category) {
		P_Category = p_Category;
	}

	public int getP_Price() {
		return P_Price;
	}

	public void setP_Price(int p_Price) {
		P_Price = p_Price;
	}

	public String getP_Img() {
		return P_Img;
	}

	public void setP_Img(String p_Img) {
		P_Img = p_Img;
	}

}
