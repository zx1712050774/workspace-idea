/**
 * Copyright (C),
 * FileName: TreeService
 * Author:   zx
 * Date:     2019/4/11 21:29
 * History:
 * zx         <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.service;

import com.jk.model.TreeBean;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 *
 * @author 17120
 * @create 2019/4/11
 * @since 1.0.0
 */
public interface TreeService {

    List<TreeBean> findTree();
}
