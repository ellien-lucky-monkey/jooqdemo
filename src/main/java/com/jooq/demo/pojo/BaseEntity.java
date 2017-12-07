package com.jooq.demo.pojo;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * @author ellien
 * @package com.jooq.demo.pojo
 * @date 2017/12/07 16:37
 * 注：需要加上@MappedSuperclass注解该类不会映射到实体表，但是他的属性都将映射到其子类的数据库字段中
 */
@MappedSuperclass
public class BaseEntity extends AbstractPersistable<Long> {
    /**
     * 创建时间
     */
    @CreatedDate
    private Date createdDate;

    /**
     * 最后修改时间
     */
    @LastModifiedDate
    private Date lastModifiedDate;

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
}
