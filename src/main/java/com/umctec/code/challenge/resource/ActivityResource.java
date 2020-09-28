package com.umctec.code.challenge.resource;

import com.umctec.code.challenge.domain.Activity;
import com.umctec.code.challenge.enumeration.FilterCardType;
import com.umctec.code.challenge.generic.CardResponsePage;
import com.umctec.code.challenge.generic.Response;
import com.umctec.code.challenge.generic.ResponsePage;
import com.umctec.code.challenge.service.ActivityService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping(value = "/activities")
@Api(value = "Activity resources", tags = ":: ACTIVITY ::")
public class ActivityResource {

    private final ActivityService activityService;

    @Autowired
    public ActivityResource(final ActivityService activityService) {
        this.activityService = activityService;
    }

    @PostMapping
    public Response<Activity> save(@RequestBody final Activity activity) {
        return Response.<Activity>builder()
                .content(this.activityService.save(activity))
                .code(HttpStatus.CREATED.value())
                .status(HttpStatus.CREATED)
                .build();
    }

    @PutMapping
    public Response<Activity> update(@RequestBody final Activity activity) {
        return Response.<Activity>builder()
                .content(this.activityService.save(activity))
                .code(HttpStatus.OK.value())
                .status(HttpStatus.OK)
                .build();
    }

    @GetMapping("/{activityId}")
    public Response<Activity> findById(@PathVariable final UUID activityId) {
        return Response.<Activity>builder()
                .content(this.activityService.findById(activityId))
                .code(HttpStatus.OK.value())
                .status(HttpStatus.OK)
                .build();
    }

    @GetMapping
    public ResponsePage<Activity> findAll(final Pageable pageable) {
        return new ResponsePage<Activity>().buildResponse(this.activityService.findAll(pageable), HttpStatus.OK);
    }

    @DeleteMapping
    public void delete(final UUID activityId) {
        this.activityService.delete(activityId);
    }

    @GetMapping("/{activityId}/create-card")
    public CardResponsePage createCard(
            @ApiParam(name = "activityId", value = "Activity Id") @PathVariable String activityId,
            @ApiParam(name = "q", value = "Search cards by patientName, visitId or billId") @RequestParam("q") String search,
            @ApiParam(name = "filter", value = "Card Filter Type") @RequestParam("filter") FilterCardType filter) {
        return null;
    }
}
