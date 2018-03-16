package girl.dao;

import girl.bean.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by frank on 2018/3/14.
 */

public interface GirlRepository extends JpaRepository<Girl,Integer> {

    /**
     * 通过年龄查询girl
     */
    public List<Girl> findByAge(Integer age);
}
