package designpattern.structural.facade;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductStoreDao {

    List<Item> items = Arrays.asList(new Item("I50200", "Teapot" ,new BigDecimal("34.5"), true),
                                     new Item("I50201", "Guitar" ,new BigDecimal("145.5"), true),
                                     new Item("I50202", "Laptop" ,new BigDecimal("390.5"), true),
                                     new Item("I50203", "Shoes" ,new BigDecimal("1344.5"), false),
                                     new Item("I50204", "Drums" ,new BigDecimal("349.5"), false),
                                     new Item("I50205", "Microphone" ,new BigDecimal("800.0"), true));

    public Item getItemById(String itemId) {
        return this.items.stream().filter(item -> item.getId().equals(itemId)).findFirst().orElse(null);
    }
}
