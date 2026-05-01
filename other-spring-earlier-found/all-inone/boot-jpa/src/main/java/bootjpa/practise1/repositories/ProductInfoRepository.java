package bootjpa.practise1.repositories;

import bootjpa.practise1.entities.onetoone.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductInfoRepository extends JpaRepository<ProductInfo, Integer> {
}
