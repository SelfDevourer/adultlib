package org.selfdevourer.adultlib.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class JavServiceTests {
    @Autowired
    private IJavService javService;

    @Test
    public void test() {
        javService.selectHome().forEach((jav) -> System.out.println(jav.getReleaseDate()));
        javService.selectPage(1).forEach((jav) -> System.out.println(jav.getReleaseDate()));
        javService.selectPage(2).forEach((jav) -> System.out.println(jav.getReleaseDate()));
    }
}
