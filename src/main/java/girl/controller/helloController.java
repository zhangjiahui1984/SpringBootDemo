package girl.controller;

import girl.GirlProp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by frank on 2018/3/14.
 */

@RestController
//    @Controller

public class helloController {

//    @Value("${cupSize}")
//    private String cupSize;
//
//    @Value("${age}")
//    private Integer age;
//
//    @Value("${content}")
//    private String content;


    @Autowired
    private GirlProp girlProp;

//    @RequestMapping(value = "hello/{id}",method = RequestMethod.GET)
////    @ResponseBody
//    public String hello(@PathVariable(value = "id",required = true) Integer id){
//        return "id = " + id;
//    }

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String hello(@RequestParam(value = "id",required = true,defaultValue = "0") Integer myId){

        return "我的ID是："+myId;
    }
}
