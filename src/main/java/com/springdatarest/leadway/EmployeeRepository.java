package com.springdatarest.leadway;

import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by rasaq on 22/01/2017.
 */
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {

}