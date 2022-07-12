package com.wesleyreisz.sample11.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
public class Harvest {
    private String name;
    private Integer qty;
    private Float price;
}
