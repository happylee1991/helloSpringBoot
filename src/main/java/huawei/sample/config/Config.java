package huawei.sample.config;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author 李斌
 * @date 2019/12/6 - 10:47 下午
 */

@Component
public class Config {
//    @Value("${server.port}")
    @Value("${spring.profiles.active}")
    private String server_port;
    private double test_value=999.0;

    public String getServer_port() {
        return server_port;
    }
}
