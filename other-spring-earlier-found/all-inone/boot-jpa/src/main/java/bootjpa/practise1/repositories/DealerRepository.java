package bootjpa.practise1.repositories;

import bootjpa.practise1.entities.onetomany.Dealer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DealerRepository extends JpaRepository<Dealer, Integer> {
}
