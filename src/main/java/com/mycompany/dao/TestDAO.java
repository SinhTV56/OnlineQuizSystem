/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

import com.mycompany.entity.Test;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author My PC
 */
public interface TestDAO extends CrudRepository<Test, Integer>{
    
}
