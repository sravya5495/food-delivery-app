package sravya.commonVO;

import java.util.List;

public class OrderDetails {

	private String id;
	private String userName;
	private String date;
	private List<Menu> menuItems;
	private String status;

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public List<Menu> getMenuItems() {
		return menuItems;
	}
	public void setMenuItems(List<Menu> menuItems) {
		this.menuItems = menuItems;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}


}
