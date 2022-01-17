package cn.kris.org.service.impl;

import cn.kris.basic.util.PageList;
import cn.kris.org.domain.Department;
import cn.kris.org.mapper.DepartmentMapper;
import cn.kris.org.query.DepartmentQuery;
import cn.kris.org.service.DepartmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Create Date: 2022/1/17 14:16
 * Author：Kris Roland
 * Version: 1.0.0
 * Package: cn.kris.org.service.impl
 * Description: TODO
 */

@Service
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements DepartmentService {

    @Resource
    private DepartmentMapper departmentMapper;

    /**
     * 新增一条部门信息
     *
     * @param department 部门实体
     */
    @Override
    @Transactional
    public void add(Department department) {
        departmentMapper.save(department);
    }

    /**
     * 修改一条部门信息
     *
     * @param department 部门实体
     */
    @Override
    @Transactional
    public void update(Department department) {
        departmentMapper.update(department);
    }

    /**
     * 通过id删除一条部门信息
     *
     * @param id 部门id
     */
    @Override
    @Transactional
    public void remove(Long id) {
        departmentMapper.delete(id);
    }

    /**
     * 加载单个部门信息
     *
     * @param id 部门id
     * @return cn.kris.org.domain.Department 部门实体
     */
    @Override
    public Department queryById(Long id) {
        return departmentMapper.loadById(id);
    }

    /**
     * 查询所有部门信息
     *
     * @return List<Department></> 部门列表
     */
    @Override
    public List<Department> queryAll() {
        return departmentMapper.loadAll();
    }

    /**
     * 查询当前页数据
     *
     * @param query cn.kris.org.domain.Department 查询实体
     * @return Long 条数
     */
    @Override
    public PageList<Department> queryPage(DepartmentQuery query) {
        //通过查询实体类查询总数
        Long count = departmentMapper.queryCount(query);
        //通过查询实体类查询列表
        List<Department> list = departmentMapper.queryData(query);
        return new PageList<>(count, list);
    }
}
