package com.example.watchList.domain;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface WatchRepository extends CrudRepository<Watch, Long> {
	List<Watch> findByBrand(String brand);
}
