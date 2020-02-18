package com.stoner.service;

import com.stoner.entity.Chain;

public interface CRUDService {
    void save(Chain chain);

    Chain[] findAll();
}
