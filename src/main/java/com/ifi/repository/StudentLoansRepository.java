/*
 * Created on 2018-09-27 ( Date ISO 2018-09-27 - Time 10:31:43 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.0.0
*/
package com.ifi.repository;

import com.ifi.entity.StudentLoans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Jpa repository for StudentLoans.
 * @author Telosys (http://www.telosys.org/) version 3.0.0
 */
@Repository
public interface StudentLoansRepository  extends JpaRepository<StudentLoans, Integer> {}