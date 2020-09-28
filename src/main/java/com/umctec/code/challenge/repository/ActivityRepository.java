package com.umctec.code.challenge.repository;

import com.umctec.code.challenge.domain.Activity;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, UUID> {
//    @Query(value = "SELECT * FROM USERS u WHERE u.id = ?1 AND ",
//            nativeQuery = true)
//    void createCard(final String activityId, final String search, final FilterCardType filter);
}
