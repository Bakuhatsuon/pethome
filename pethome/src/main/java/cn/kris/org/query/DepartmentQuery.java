package cn.kris.org.query;

import cn.kris.org.domain.Department;
import cn.kris.org.domain.Employee;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;

/**
 * Create Date: 2022/1/17 12:53
 * Author：Kris Roland
 * Version: 0.0.1
 * Package: cn.kris.org.query
 * Description: TODO
 */

@Data
public class DepartmentQuery implements Serializable {

    /**
     * 当前页数 默认为1
     */
    private Integer currentPage = 1;

    /**
     * 每页显示条数 默认为10
     */
    private Integer pageSize = 10;

    /**
     * 自定义方法返回查询开始页数
     * @return 页数
     */
    public Integer getStart() {
        return (this.currentPage - 1) * this.pageSize;
    }

}
