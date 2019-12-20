/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.entity.Test_type;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author My PC
 */
public interface Test_typeDAO extends CrudRepository<Test_type, Integer>{
    @Query(value = "SELECT * FROM Test_type WHERE test_type_name = ?1",nativeQuery = true)
    List<Test_type> getTesttypebyname(String testTypename);
}
