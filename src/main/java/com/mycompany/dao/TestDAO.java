
package com.mycompany.dao;

import com.mycompany.entity.Test;
import org.springframework.data.repository.CrudRepository;

public interface TestDAO extends CrudRepository<Test, Integer>{
    
}
