package sravya.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import sravya.entity.Destination;
import org.springframework.stereotype.Repository;

@Repository
public interface DestinationRepository extends JpaRepository<Destination, Long> {

    List<Destination> findByOriginId(Long OriginId);
}
