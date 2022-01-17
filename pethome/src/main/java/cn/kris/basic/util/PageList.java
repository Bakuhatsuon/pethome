package cn.kris.basic.util;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Create Date: 2022/1/17 14:12
 * Author：Kris Roland
 * Version: 0.0.1
 * Package: cn.kris.basic.util
 * Description: TODO
 */

@Data
@AllArgsConstructor
public class PageList<T> {
    /**
     * 页总条数
     */
    private Long total = 0L;

    /**
     * 每页存储的信息
     */
    private List<T> rows = new ArrayList<>();
}
