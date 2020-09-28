package com.umctec.code.challenge.data;

import com.umctec.code.challenge.domain.Bill;
import com.umctec.code.challenge.domain.Patient;
import com.umctec.code.challenge.domain.Visit;
import com.umctec.code.challenge.enumeration.SLAStatus;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public final class CardTO {
    private final SLAStatus slaStatus;
    private final Integer daysSinceCreated;
    private final Visit visit;
    private final Patient patient;
    private final Bill bill;
    private final Integer numberOfPendencies;
    private final Integer numberOfOpenPendencies;
    private final Integer numberOfDocuments;
    private final Integer numberOfNotReceivedDocuments;
    private final Integer numberOfChecklistItem;
    private final Integer numberOfDoneChecklistItem;
}
