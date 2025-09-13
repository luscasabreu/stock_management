package stock.management.api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import stock.management.api.dto.CategoryDTO;

@Table(name = "categories")
@Entity(name = "Category")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "code")
public class Category {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;
    private String descripstion;

    public Category(CategoryDTO category) {
        this.descripstion = category.description();
    }

}
