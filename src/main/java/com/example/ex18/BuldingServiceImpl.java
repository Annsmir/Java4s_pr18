package com.example.ex18;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BuldingServiceImpl implements BuildingService {
    private final BuildingRepository rep;

    @Override
    public List<Building> getAll() {
        return rep.findAll();
    }

    @Override
    public Building getById(long id) {

        if(rep.existsById(id)) {
            return rep.getById(id);
        } else {
            return null;
        }

    }

    @Override
    public void deleteById(long id) {
        rep.deleteById(id);
    }

    @Override
    public void update(Building a) {
        rep.saveAndFlush(a);
    }

    @Override
    public void create(Building a) {
        rep.saveAndFlush(a);
    }

    @Override
    public List<Building> findByCreationDate(String creationDate) {
        return rep.findByCreationDate(creationDate);
    }

    @Override
    public List<Building> findByType(String type) {
        return rep.findByType(type);
    }
}
