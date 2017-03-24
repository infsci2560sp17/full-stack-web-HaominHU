package edu.infsci2560.repositories;

import edu.infsci2560.models.gameRequest;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author kolobj
 */
public interface gameRequestRepository extends PagingAndSortingRepository<gameRequest, Long> {}