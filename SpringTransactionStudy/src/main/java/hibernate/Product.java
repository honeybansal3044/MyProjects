package hibernate;

import java.util.Date;
import java.util.List;

public class Product implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private int productId;
	private String name;
	private Integer defaultUnitPrice;
	private Date createDate;

	public Product() {
	}

	public Product(int productId, String name) {
		this.productId = productId;
		this.name = name;
	}

	// public Set<ProductSales> sales;
	// public Set<ProductSales> getSales() {
	// return this.sales;
	// }
	// public void setSales(Set<ProductSales> sales) {
	// this.sales = sales;
	// }
	public List<ProductSales> sales;

	public List<ProductSales> getSales() {
		return this.sales;
	}

	public void setSales(List<ProductSales> sales) {
		this.sales = sales;
	}

	public Product(int productId, String name, Integer defaultUnitPrice, Date createDate) {
		this.productId = productId;
		this.name = name;
		this.defaultUnitPrice = defaultUnitPrice;
		this.createDate = createDate;
	}

	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDefaultUnitPrice() {
		return this.defaultUnitPrice;
	}

	public void setDefaultUnitPrice(Integer defaultUnitPrice) {
		this.defaultUnitPrice = defaultUnitPrice;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}
