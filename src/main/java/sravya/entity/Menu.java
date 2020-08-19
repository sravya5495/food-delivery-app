package sravya.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Menu {

	@Id
	@GeneratedValue
	private Long id;

	private String type;

	private String info;

	@OneToMany(mappedBy = "menu", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
	private List<MenuItem> items;

	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "restaurant_id")
	private Restaurant restaurant;

	@JsonSetter
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	@JsonGetter
	public Restaurant getRestaurant() {
		return restaurant;
	}

	@JsonCreator
	public Menu(@JsonProperty("id") Long id, @JsonProperty("type") String type, @JsonProperty("info") String info, @JsonProperty("items") List<MenuItem> items) {
		this.id = id;
		this.type = type;
		this.info = info;
		/*if (items != null) {
            this.items = items;
            for (MenuItem item : items)
                item.setMenu(this);
        }*/
	}

	public Menu(Long id, String type, String info, Restaurant restaurant) {
		this.id = id;
		this.type = type;
		this.info = info;
		this.restaurant = restaurant;
	}

	@Override
	public String toString() {
		return "Menu{" +
				"id=" + id +
				", type='" + type + '\'' +
				", info='" + info + '\'' +
				", items=" + items +
				'}';
	}
}
