package sravya.commonVO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MenuItem {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String info;

    private String imageUrl;

    private Double price;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "menu_id")
    private Menu menu;

    public MenuItem(@JsonProperty("id") Long id, @JsonProperty("name") String name, @JsonProperty("info") String info,
                    @JsonProperty("imageUrl") String imageUrl, @JsonProperty("price") Double price) {
        this.id = id;
        this.name = name;
        this.info = info;
        this.imageUrl = imageUrl;
        this.price = price;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", info='" + info + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", price=" + price +
                '}';
    }
}
