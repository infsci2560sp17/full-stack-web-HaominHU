package edu.infsci2560.repositories;

import edu.infsci2560.models.personalInfo;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author kolobj
 */
public interface personalInfoRepository extends PagingAndSortingRepository<personalInfo, Long> {}