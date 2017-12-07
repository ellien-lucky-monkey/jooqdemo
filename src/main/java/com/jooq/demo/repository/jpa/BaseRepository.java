package com.jooq.demo.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * @author ellien
 * @package com.jooq.demo.jparepository
 * @date 2017/12/07 16:24
 */
@NoRepositoryBean
public interface BaseRepository <T, ID extends Serializable> extends JpaRepository<T, ID>, JpaSpecificationExecutor<T>,CrudRepository<T, ID>{
}
