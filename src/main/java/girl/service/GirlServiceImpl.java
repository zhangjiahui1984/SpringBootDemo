package girl.service;

import girl.bean.Girl;
import girl.dao.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by frank on 2018/3/14.
 */
@Service
public class GirlServiceImpl implements GirlService{
    @Autowired
    private GirlRepository dao;

    @Override
    public List<Girl> getAll() {
        return dao.findAll();
    }

    @Override
    public Girl FindGirl(Integer id) {
        return dao.getOne(id);
    }

    @Override
    public List<Girl> findByAge(Integer age) {
        return dao.findByAge(age);
    }

    @Override
    public Girl addGirl(Integer age, String cupSize) {
        if(cupSize.isEmpty()){
            return null;
        }
        Girl girl = new Girl();
        girl.setAge(age);
        girl.setCupSize(cupSize);
        return dao.save(girl);
    }

    @Override
    public Girl updateGirl(Integer id, Integer age, String cupSize) {
        if(cupSize.isEmpty()){
            return null;
        }
        Girl girl = new Girl();
        girl.setId(id);
        girl.setAge(age);
        girl.setCupSize(cupSize);
        return dao.save(girl);
    }

    @Override
    public void delGirl(Integer id) {
         dao.deleteById(id);
    }

    @Override
    public List<Girl> adds(List<Girl> girls) {
        return null;
    }
}
