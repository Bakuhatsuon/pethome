package cn.kris.org.service;

import cn.kris.basic.util.PageList;
import cn.kris.org.domain.Department;
import cn.kris.org.query.DepartmentQuery;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 14016
* @description 针对表【t_department】的数据库操作Service
* @createDate 2022-01-17 12:38:25
*/
@SuppressWarnings("all")
public interface DepartmentService extends IService<Department> {

    /**
     * 新增一条部门信息
     * @param department 部门实体
     */
    void add(Department department);

    /**
     * 修改一条部门信息
     * @param department 部门实体
     */
    void update(Department department);

    /**
     * 通过id删除一条部门信息
     * @param id 部门id
     */
    void remove(Long id);

    /**
     * 加载单个部门信息
     * @param id 部门id
     * @return cn.kris.org.domain.Department 部门实体
     */
    Department queryById(Long id);

    /**
     * 查询所有部门信息
     * @return List<Department></> 部门列表
     */
    List<Department> queryAll();

    /**
     * 查询当前页数据
     * @param query cn.kris.org.domain.Department 查询实体
     * @return Long 条数
     */
    PageList<Department> queryPage(DepartmentQuery query);
}
