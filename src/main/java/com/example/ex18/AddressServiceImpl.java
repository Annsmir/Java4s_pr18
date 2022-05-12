package com.example.ex18;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {
    private final AddressRepository rep;

    @Override
    public List<Address> getAll() {
        return rep.findAll();
    }

    @Override
    public Address getById(Long id) {
        if(rep.existsById(id)) {
            return rep.getById(id);
        } else {
            return null;
        }
    }

    @Override
    public void deleteById(Long id){
        rep.deleteById(id);
    }

    @Override
    public void update(Address a) {
        rep.saveAndFlush(a);
    }

    @Override
    public void create(Address a) {
        rep.saveAndFlush(a);
    }

    @Override
    public List<Address> findByZip(String zip) {
        return rep.findAllByZipCode(zip);
    }

    @Override
    public List<Address> findByText(String text) {
        return rep.findAllByAddressText(text);
    }

    @Override
    public List<Address> findByBuilding(Long bId) {
        return rep.findAllByBuildingId(bId);
    }

}
