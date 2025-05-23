package com.backend.couriersyncfeat4.repository;

import com.backend.couriersyncfeat4.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {
}
