package ua.goit.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Promo {
    private Integer promoQuantity;
    private Double promoPrice;
}
