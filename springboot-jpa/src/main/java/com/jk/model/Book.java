/**
 * Copyright (C), 2019-2019, 金科1809
 * FileName: Book
 * Author:   史超
 * Date:     2019/4/11 16:50
 * History:
 * <author>          <time>          <version>          <desc>
 * 史超           修改时间           版本号              描述
 */
package com.jk.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 *
 * @create 2019/4/11
 * @since 1.0.0
 */
@Entity
@Table(name="t_book")
public class Book implements Serializable {

    private static final long serialVersionUID = 2559039440557915616L;
    @Id
    @GeneratedValue
    private Integer id;

    private String bookName;

    @CreatedDate
    @JsonFormat(pattern="yyyy-MM-dd ")
    private Date bookDate;

    private Double bookPrice;

    private Integer typeId;
    @Transient
    private String typeName;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Date getBookDate() {
        return bookDate;
    }

    public void setBookDate(Date bookDate) {
        this.bookDate = bookDate;
    }

    public Double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", bookDate=" + bookDate +
                ", bookPrice=" + bookPrice +
                ", typeId=" + typeId +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}
