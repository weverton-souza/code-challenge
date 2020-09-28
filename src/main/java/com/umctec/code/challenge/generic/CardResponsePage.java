package com.umctec.code.challenge.generic;

import com.umctec.code.challenge.data.CardTO;
import com.umctec.code.challenge.enumeration.SLAStatus;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CardResponsePage {
    private List<CardTO> content;
    private SLAStatus totalCardsOk;
    private SLAStatus totalCardsWarning;
    private SLAStatus totalCardsDelayed;
    private Integer code;
    private HttpStatus status;
    private PageInfo pageInfo;

    public CardResponsePage buildResponse(final Page<CardTO> page, HttpStatus httpStatus) {
        return CardResponsePage.builder()
                .content(page.getContent())
                .code(httpStatus.value())
                .status(httpStatus)
                .pageInfo(PageInfo.buildPageInfo(page))
                .build();
    }
}
