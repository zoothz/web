package com.web.model;

public class ProductModel extends AbsModel<ProductModel> {
	
	private String name;
	private long price;
	private String image;
	private CateModel idcate;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	public CateModel getIdcate() {
		return idcate;
	}
	public void setIdcate(CateModel idcate) {
		this.idcate = idcate;
	}
	
}
