package com.springdatarest.dataRepos;

import com.springdatarest.models.LandLord;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by mac on 6/29/17.
 */
public interface LandLordRepository extends PagingAndSortingRepository<LandLord, Long> {
}
