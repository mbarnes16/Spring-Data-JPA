package edu.wctc.springdatajpa.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@Table(name="Shirt")
public class Shirt {
    @Id
    @Column(name="shirt_id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="price")
    private String price;
    @Column(name="quantity_in_stock")
    private String stock;
    @Column(name="image_file_name")
    private String imageFileName;
}
