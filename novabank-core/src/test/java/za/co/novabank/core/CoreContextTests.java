package za.co.novabank.core;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Noxolo.Mkhungo
 */

@Slf4j
@SpringJUnitConfig
@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:/META-INF/core-application-context.xml")
class CoreContextTests {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    @DisplayName("Core Context Load Test")
    void contextLoads() {
        assertNotNull(applicationContext, "Application context should not be null.");
    }

    @Test
    @DisplayName("Bean Loading Test")
    void beanLoadingTest() {
        assertNotNull(applicationContext.getBean("yamlProperties"), "yamlProperties bean should be loaded.");
        assertNotNull(applicationContext.getBean("messageSource"), "messageSource bean should be loaded.");
    }
}
