package stock.management.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import stock.management.api.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
