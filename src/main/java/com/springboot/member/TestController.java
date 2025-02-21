package com.springboot.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/dept/{id}")
    public Map<String,Object> getDept(@PathVariable Long id) {
        Map<String,Object> response = new LinkedHashMap<>();
        response.put("id",1);
        response.put("dept_cd","CS001023004");
        response.put("dept_nm","컨테이너 실습");
        response.put("level",3);
        response.put("rel_dept_cd","CS0010230000");
        response.put("rel_dept_num","수강생대표팀");

        return response;
    }


}
