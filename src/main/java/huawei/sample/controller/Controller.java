package huawei.sample.controller;

import huawei.sample.config.Config;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;

/**
 * @author 李斌
 * @date 2019/12/8 - 12:29 上午
 */
@Slf4j
@RestController
@EnableScheduling
public class Controller {

    @Autowired
    private Config config;
    @GetMapping("/")
    public String index() {
        return "here is index!";
    }

    @Scheduled(cron = "0/5 * * * * * ")
    public void client() {
        System.out.println(index());

    }



}
