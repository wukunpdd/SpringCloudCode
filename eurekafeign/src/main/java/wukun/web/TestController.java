package wukun.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wukun.service.ApiService;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private ApiService apiService;

    @RequestMapping("/hello")
    public String hello(){
        System.out.println(apiService.index());
        return apiService.index();
    }
}
