package com.springdatarest.dataRepos;

import com.springdatarest.models.Tenant;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by mac on 6/29/17.
 */
public interface TenantRepsitory extends PagingAndSortingRepository<Tenant,Long> {
}
