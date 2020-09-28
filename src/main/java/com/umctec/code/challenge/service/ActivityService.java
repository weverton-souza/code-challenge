package com.umctec.code.challenge.service;

import com.umctec.code.challenge.domain.Activity;
import com.umctec.code.challenge.enumeration.FilterCardType;
import com.umctec.code.challenge.generic.CardResponsePage;
import com.umctec.code.challenge.generic.ResponsePage;
import com.umctec.code.challenge.repository.ActivityRepository;
import io.swagger.annotations.ApiParam;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class ActivityService {
    private final ActivityRepository activityRepository;

    @Autowired
    public ActivityService(final ActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }

    public Activity save(final Activity activity) {
        return this.activityRepository.save(activity);
    }

    public Activity findById(final UUID activityId) {
        return this.activityRepository.findById(activityId).orElseThrow();
    }

    public Page<Activity> findAll(final Pageable pageable) {
        return this.activityRepository.findAll(pageable);
    }

    public void delete(final UUID activityId) {
        this.activityRepository.delete(this.findById(activityId));
    }

    public CardResponsePage createCard(final String activityId, final String search, final FilterCardType filter) {
        return null;
    }

}
