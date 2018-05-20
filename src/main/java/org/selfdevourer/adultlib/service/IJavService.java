package org.selfdevourer.adultlib.service;

import org.selfdevourer.adultlib.entity.Jav;
import org.springframework.data.domain.Page;

import java.util.List;

public interface IJavService {
    List<Jav> findAll();

    List<Jav> selectHome();

    Page<Jav> selectPage(Integer index);

    Jav findById(String id);
}
