package sravya.entity;

import java.util.List;

public class Destination {

	private long id;
	private String name;
	private long originId;
	private List<Restaurant> restaunts;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getOriginId() {
		return originId;
	}
	public void setOriginId(long originId) {
		this.originId = originId;
	}
	public List<Restaurant> getRestaunts() {
		return restaunts;
	}
	public void setRestaunts(List<Restaurant> restaunts) {
		this.restaunts = restaunts;
	}



}
