/**
 * Copyright (C),
 * FileName: TreeDao
 * Author:   zx
 * Date:     2019/4/11 21:30
 * History:
 * zx         <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.dao;

import com.jk.model.TreeBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 *
 * @author 17120
 * @create 2019/4/11
 * @since 1.0.0
 */
@Repository
public interface TreeDao extends JpaRepository<TreeBean,Integer> {

    @Query(nativeQuery = true,value=" SELECT id,pid,text,href from t_tree where pid=?1")
    List<TreeBean> findTreeByPid(Integer pid);
}
