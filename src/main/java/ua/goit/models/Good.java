package ua.goit.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Good {
    private Character id;
    private Double price;
    private Promo promo;
}
