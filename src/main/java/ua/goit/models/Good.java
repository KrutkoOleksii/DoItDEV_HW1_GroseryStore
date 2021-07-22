package ua.goit.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Good implements BaseEntity<String>{
    private String id;
    private Double price;
    private Promo promo;
}
