package sravya.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import sravya.entity.Restaurant;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
	 List<Restaurant> findById(Long id);
}
