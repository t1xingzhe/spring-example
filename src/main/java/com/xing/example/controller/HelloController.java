package com.xing.example.controller;

import com.xing.example.service.ConsumerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author xingzhe
 * @description
 * @update 2014年6月20日 上午10:48:42
 */
@RestController
public class HelloController {

    private final static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private ConsumerService consumerService;

    @GetMapping("/question/{id}")
    public Object question(@PathVariable(value = "id") long id) {
        return consumerService.getQuestionList(id);
    }

    @GetMapping("/answer/{id}")
    public Object answer(@PathVariable(value = "id") long id) {
        return consumerService.getAnswers(id);
    }
}
