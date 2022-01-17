package cn.kris.org.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

import lombok.*;

/**
 * 
 * @TableName t_department
 */
@TableName(value ="t_department")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department implements Serializable {
    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 部门编号
     */
    private String sn;

    /**
     * 部门名称
     */
    private String name;

    /**
     * 部门的上级分类层级id
     */
    private String dirpath;

    /**
     * 部门状态，0正常，1禁用
     */
    private Integer state;

    /**
     * 部门管理员，关联Employee表id
     */
    private Long manager_id;

    /**
     * 查询实体类 员工实体类
     */
    private Employee manager;

    /**
     * 上级部门
     */
    private Long parent_id;

    /**
     * 查询实体类 部门实体类
     */
    private Department parent;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

}