/**
 * Copyright (C), 2019-2019, 金科1809
 * FileName: BookType
 * Author:   史超
 * Date:     2019/4/11 17:12
 * History:
 * <author>          <time>          <version>          <desc>
 * 史超           修改时间           版本号              描述
 */
package com.jk.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br> 
 *
 * @create 2019/4/11
 * @since 1.0.0
 */
@Entity
@Table(name="t_booktype")
public class BookType implements Serializable {

    private static final long serialVersionUID = 1662517870860312419L;


    @Id
    @GeneratedValue
    private Integer id;

    private String typeName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "BookType{" +
                "id=" + id +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}
