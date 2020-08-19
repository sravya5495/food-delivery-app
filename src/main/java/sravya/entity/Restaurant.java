package sravya.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
public class Restaurant {

	@GeneratedValue
	@Id
	private Long id;

	private String name;

	private String location;

	@JsonManagedReference
	@OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
	private List<Menu> menus;

	@JsonCreator
	public Restaurant(@JsonProperty("id") Long id, @JsonProperty("name") String name, @JsonProperty("location") String location, @JsonProperty("menus") List<Menu> menus) {
		this.name = name;
		this.location = location;
		if (menus != null ) {
			this.menus = menus;
			for (Menu menu : menus)
				menu.setRestaurant(this);
		}
	}

	@Override
	public String toString() {
		return "Restaurant{" +
				"id=" + id +
				", name='" + name + '\'' +
				", location='" + location + '\'' +
				", menus=" + menus +
				'}';
	}
}
