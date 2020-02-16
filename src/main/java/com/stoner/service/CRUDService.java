package com.stoner.service;

import com.stoner.entity.Necklaces;

public interface CRUDService {
    void save(Necklaces necklaces);

    Necklaces[] findAll();
}
