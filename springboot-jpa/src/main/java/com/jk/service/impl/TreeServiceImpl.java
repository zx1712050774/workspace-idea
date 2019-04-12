/**
 * Copyright (C),
 * FileName: TreeServiceImpl
 * Author:   zx
 * Date:     2019/4/11 21:29
 * History:
 * zx         <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.service.impl;

import com.jk.dao.TreeDao;
import com.jk.model.TreeBean;
import com.jk.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * @author 17120
 * @create 2019/4/11
 * @since 1.0.0
 */
@Service
public class TreeServiceImpl implements TreeService {
    @Autowired
    private TreeDao treeDao;

    @Override
    public List<TreeBean> findTree() {
        int pid = 0;
        List<TreeBean> list = findNodes(pid);
        return list;
    }

    private List<TreeBean> findNodes(int pid) {
        List<TreeBean> list = treeDao.findTreeByPid(pid);
        for (TreeBean treeBean : list) {
            Integer id = treeBean.getId();
            List<TreeBean> nodes = findNodes(id);//[]

            if(nodes.size()<=0){
                //没有子节点，应该点击
                treeBean.setSelectable(true);
            }else{
                treeBean.setNodes(nodes);
                treeBean.setSelectable(false);
            }
        }
        return list;
    }
}
