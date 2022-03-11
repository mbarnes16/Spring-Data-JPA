package edu.wctc.springdatajpa.service;

import edu.wctc.springdatajpa.entity.Shirt;
import edu.wctc.springdatajpa.repo.ShirtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class BasicShirtService implements ShirtService{
    private ShirtRepository shirtRepository;

    @Autowired
    public BasicShirtService(ShirtRepository sr) {
        this.shirtRepository = sr;
    }

    @Override
    public Shirt getShirt(int shirtId) {
        Shirt sh;
        Optional<Shirt> s = shirtRepository.findById(shirtId);
        if (s.isPresent()) {
            return s.get();
        }
        else  {
            sh = new Shirt();
            sh.setId(shirtId);
        }
        return sh;

    }

    @Override
    public void updateShirt(Shirt shirt) {
        shirtRepository.save(shirt);
    }

    @Override
    public List<Shirt> getShirtList() {
        List<Shirt> list = new ArrayList<>();
        shirtRepository.findAll().forEach(list::add);
        return list;
    }
}


