package org.selfdevourer.adultlib.service.impl;

import org.selfdevourer.adultlib.dao.JavRepository;
import org.selfdevourer.adultlib.entity.Jav;
import org.selfdevourer.adultlib.service.IJavService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JavServiceImpl implements IJavService {
    @Autowired
    private JavRepository repository;

    @Override
    public List<Jav> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Jav> selectHome() {
        PageRequest page = PageRequest.of(0, 18);
        return repository.findAll(page).getContent();
    }

    @Override
    public Page<Jav> selectPage(Integer index) {
        PageRequest page = PageRequest.of(index, 18);
        return repository.findAll(page);
    }

    @Override
    public Jav findById(String id) {
        return repository.findById(id).get();
    }
}
