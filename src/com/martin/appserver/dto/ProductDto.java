package com.martin.appserver.dto;

import java.util.List;

public class ProductDto {
    public Long id;
    public String name;
    public String description;
    public Double price;
    public Double purchase_price;
    public Integer stock;
    public String status;
    public List<String> images;
    public List<Long> category_ids;
    public Long created_at;
}
