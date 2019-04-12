/**
 * Copyright (C), 2019, 中央人民政府
 * FileName: TreeBean
 * Author:   lxz
 * Date:     2019/4/11 19:07
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈b〉
 *
 * @author lenovo
 * @create 2019/4/11
 * @since 1.0.0
 */
@Entity
@Table(name = "t_tree")
public class TreeBean implements Serializable {
    private static final long serialVersionUID = -3881263818630907304L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String text;
    private Integer pid;
    private String href;
    @Transient
    private List<TreeBean> nodes;
    @Transient
    private Boolean selectable;//是否可以点击

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public List<TreeBean> getNodes() {
        return nodes;
    }

    public void setNodes(List<TreeBean> nodes) {
        this.nodes = nodes;
    }

    public Boolean getSelectable() {
        return selectable;
    }

    public void setSelectable(Boolean selectable) {
        this.selectable = selectable;
    }

    @Override
    public String toString() {
        return "TreeBean{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", pid=" + pid +
                ", href='" + href + '\'' +
                ", nodes=" + nodes +
                ", selectable=" + selectable +
                '}';
    }
}