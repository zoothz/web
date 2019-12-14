package com.web.model;

public class CarItemModel extends AbsModel<CarItemModel> {
	
	private String name;
	
	

	private long unitPrice;
	private ProductModel idproduct;
	private CarModel idcar;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(long unitPrice) {
		this.unitPrice = unitPrice;
	}
	public ProductModel getIdproduct() {
		return idproduct;
	}
	public void setIdproduct(ProductModel idproduct) {
		this.idproduct = idproduct;
	}
	public CarModel getIdcar() {
		return idcar;
	}
	public void setIdcar(CarModel idcar) {
		this.idcar = idcar;
	}
	
}
