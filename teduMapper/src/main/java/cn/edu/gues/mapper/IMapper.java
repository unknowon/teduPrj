package cn.edu.gues.mapper;

import java.util.List;

public interface IMapper<T> {

    /**
     * 新增
     * @param pojo
     * @return
     */
    int insert(T pojo);

    /**
     * 根据id进行更新
     * @param pojo
     * @return
     */
    int update(T pojo);

    /**
     * 根据id进行删除
     * @param rid
     * @return
     */
    int delete(Long rid);

    /**
     * 以非空字段值作为查询条件进行查询
     * @param pojo
     * @return
     */
    List<T> select(T pojo);
}
