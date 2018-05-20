package org.selfdevourer.adultlib.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class JavRepositoryTest {
    @Autowired
    private JavRepository repository;

    @Test
    public void test() {
        repository.findAll(PageRequest.of(0, 20)).getContent().forEach((jav) -> System.out.println(jav));
        System.out.println("page 1");
        repository.findAll(PageRequest.of(1, 20)).getContent().forEach((jav) -> System.out.println(jav));
        System.out.println("page 2");
        repository.findAll(PageRequest.of(2, 20)).getContent().forEach((jav) -> System.out.println(jav));
        System.out.println("page 3");
    }
}
