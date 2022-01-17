package cn.kris.org.service;

import cn.kris.App;
import cn.kris.basic.util.PageList;
import cn.kris.org.domain.Department;
import cn.kris.org.query.DepartmentQuery;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Create Date: 2022/1/17 15:28
 * Author：Kris Roland
 * Version:
 * Package: cn.kris.org.service
 * Description: TODO
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
class DepartmentServiceTest {

    @Autowired
    private DepartmentService service;

    /**
     * 测试添加功能
     */
    @Test
    void add() {
        Department department = new Department();
        department.setSn("5");
        department.setName("66677777");
        department.setDirpath("/2/7/40");
        department.setState(0);

        service.add(department);
    }

    /**
     * 测试更新功能
     */
    @Test
    void update() {
        Department department = new Department();
        department.setId(40L);
        department.setSn("5");
        department.setName("66666666");
        department.setDirpath("/2/7/40");
        department.setState(0);
        department.setManager_id(324L);
        department.setParent_id(11L);

        service.update(department);
    }

    /**
     * 测试删除功能
     */
    @Test
    void remove() {
        service.remove(46L);
    }

    /**
     * 测试条件查询及分页功能
     */
    @Test
    void queryPage() {
        PageList<Department> list = service.queryPage(new DepartmentQuery());
        System.out.println(list.getTotal());
        list.getRows().forEach(System.out::println);
    }
}