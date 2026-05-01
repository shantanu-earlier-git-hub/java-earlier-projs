package bootjpa.practise1.repositories;


import bootjpa.practise1.entities.onetoone.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
