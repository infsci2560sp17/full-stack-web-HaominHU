package edu.infsci2560.repositories;

import edu.infsci2560.models.gameStation;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author kolobj
 */
public interface gameStationRepository extends PagingAndSortingRepository<gameStation, Long> {}