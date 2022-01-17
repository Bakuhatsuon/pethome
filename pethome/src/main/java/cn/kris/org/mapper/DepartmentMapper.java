package cn.kris.org.mapper;

import cn.kris.org.domain.Department;
import cn.kris.org.query.DepartmentQuery;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
* @author 14016
* @description 针对表【t_department】的数据库操作Mapper
* @createDate 2022-01-17 12:38:25
* @Entity cn.kris.org.domain.Department
*/
@Mapper
public interface DepartmentMapper extends BaseMapper<Department> {

    /**
     * 新增一条部门信息
     * @param department 部门实体
     */
    @Insert("insert into t_department(" +
            "sn," +
            "name," +
            "dirPath," +
            "state," +
            "manager_id," +
            "parent_id" +
            ") values(" +
            "#{sn},#{name},#{dirpath},#{state}," +
            "#{manager_id},#{parent_id}" +
            ")"
    )
    void save(Department department);

    /**
     * 修改一条部门信息
     * @param department 部门实体
     */
    @Update("update t_department set " +
            "sn = #{sn}," +
            "name = #{name}," +
            "dirPath = #{dirpath}," +
            "state = #{state}," +
            "manager_id = #{manager_id}," +
            "parent_id = #{parent_id}" +
            " where id = #{id}"
    )
    void update(Department department);

    /**
     * 通过id删除一条部门信息
     * @param id 部门id
     */
    @Delete("delete from t_department where id = #{id};")
    void delete(Long id);

    /**
     * 加载单个部门信息
     * @param id 部门id
     * @return cn.kris.org.domain.Department 部门实体
     */
    @Select("select * from t_department where id = #{id};")
    Department loadById(Long id);

    /**
     * 加载所有部门信息
     * @return List<Department></> 部门列表
     */
    @Select("select * from t_department;")
    List<Department> loadAll();

    /**
     * 查询总条数
     * @param query cn.kris.org.domain.Department 查询实体
     * @return Long 条数
     */
    Long queryCount(DepartmentQuery query);

    /**
     * 查询当前页部门信息
     * @param query cn.kris.org.domain.Department 查询实体
     * @return List<Department></> 部门列表
     */
    List<Department> queryData(DepartmentQuery query);


}




