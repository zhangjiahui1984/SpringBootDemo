package girl.service;

import girl.bean.Girl;

import java.util.List;

/**
 * Created by frank on 2018/3/14.
 */
public interface GirlService {

    /**
     * 获取Girl列表
     *
     * @return list
     */
    public List<Girl> getAll();

    /**
     * 通过ID获取Girl
     *
     * @param id
     * @return Girl Bean
     */
    public Girl FindGirl(Integer id);

    /**
     * 通过年龄获取girl列表
     */

    public List<Girl> findByAge(Integer age);

    /**
     * 新增girl
     */
    public Girl addGirl(Integer age, String cupSize);

    /**
     * 修改girl
     */
    public Girl updateGirl(Integer id, Integer age, String cupSize);

    /**
     * del
     */
    public void delGirl(Integer id);

    public List<Girl> adds(List<Girl> girls);

}
