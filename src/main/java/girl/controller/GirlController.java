package girl.controller;

import girl.bean.Girl;
import girl.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by frank on 2018/3/14.
 */
@RestController
@RequestMapping("/girl")
public class GirlController {


    //注入service
    @Autowired
    private GirlService service;

    @GetMapping("/getall")
    public List<Girl>  getGirls(){
        List<Girl> girls = service.getAll();
        if( girls != null && girls.size()>0){
            for (Girl girl : girls) System.out.println(girl);
            return girls;
        }
        return null;
    }

    @GetMapping("/getone/{id}")
    public Girl findGirl(@PathVariable("id") Integer id){
        return service.FindGirl(id);
    }

    @GetMapping("/age")
    public List<Girl> findByAge(@RequestParam("age") Integer age){
        List<Girl> girls = service.findByAge(age);
        if(girls !=null && girls.size()>0){
            return girls;
        }
        return null;
    }

    @GetMapping("/addgirl")
    public Girl addGirl(@RequestParam("age") Integer age,
                        @RequestParam("cupSize") String cupSize){
//        Girl girl = new Girl();
//        girl.setAge(age);
//        girl.setCupSize(cupSize);
        Girl ret = service.addGirl(age,cupSize);
        if (ret != null) return ret;
        return null;
    }

    @GetMapping("/update")
    public String updateGirl(@RequestParam("id") Integer id,
                             @RequestParam("age")Integer age,
                             @RequestParam("cupSize") String cupSize){
//        Girl girl = new Girl();
//        girl.setId(id);
//        girl.setAge(age);
//        girl.setCupSize(cupSize);
        Girl ret = service.updateGirl(id,age,cupSize);
        if(ret!=null) return "SUCCESS";
        return "ERROR";
    }

    public void testmain(){
        System.out.println("lalasdfkaslfs");
    }
}
