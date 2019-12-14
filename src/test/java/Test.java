import huawei.sample.HelloSpringBootApplication;
import huawei.sample.config.Config;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author 李斌
 * @date 2019/12/8 - 12:24 上午
 */
@SpringBootTest(classes = HelloSpringBootApplication.class,webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)

public class Test {
    @Autowired
    private Config config;

    @org.junit.jupiter.api.Test
    public void testSpring() {
        System.out.println(config.getServer_port());
    }

    @org.junit.Test
    public void testStr() {
        System.out.println("\\test\\a.txt".replaceAll("\\\\","\\\\\\\\"));
    }
}

