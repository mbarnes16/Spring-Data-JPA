package edu.wctc.springdatajpa.service;

import edu.wctc.springdatajpa.entity.Shirt;

import java.util.List;

public interface ShirtService {
    Shirt getShirt(int shirtId);
    void updateShirt(Shirt shirt);

    List<Shirt> getShirtList();
}
