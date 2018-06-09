package org.selfdevourer.adultlib.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class JavRepositoryTest {
    @Autowired
    private JavRepository repository;

    @Test
    public void test() {
        Sort sort = new Sort(Sort.Direction.DESC, "release_data");
        repository.findAll(PageRequest.of(0, 18, sort)).getContent().forEach((jav) -> System.out.println(jav.getReleaseDate()));
        System.out.println("page 1");
        repository.findAll(PageRequest.of(1, 18, sort)).getContent().forEach((jav) -> System.out.println(jav.getReleaseDate()));
        System.out.println("page 2");
        repository.findAll(PageRequest.of(2, 18, sort)).getContent().forEach((jav) -> System.out.println(jav.getReleaseDate()));
        System.out.println("page 3");
    }
}
