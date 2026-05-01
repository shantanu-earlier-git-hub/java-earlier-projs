package bootjpa.practise1.repositories;

import bootjpa.practise1.entities.onetomany.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
