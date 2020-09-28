package com.umctec.code.challenge.generic;

import com.umctec.code.challenge.data.CardTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PageInfo {
    protected Boolean isPage;
    protected String message = "Operation performed successfully";
    protected Integer code;
    protected HttpStatus status;
    protected Pageable pageable;
    protected Integer totalElements;
    protected Integer totalPages;
    protected Boolean first;
    protected Boolean last;
    protected Integer size;
    protected Integer number;
    protected Sort sort;
    protected Integer numberOfElements;
    protected Boolean empty;

    public static PageInfo buildPageInfo(final Page<CardTO> page) {
        return PageInfo.builder()
                .isPage(page.getPageable().isPaged())
                .pageable(page.getPageable())
                .totalElements(page.getNumberOfElements())
                .totalPages(page.getTotalPages())
                .first(page.isFirst())
                .last(page.isLast())
                .size(page.getSize())
                .number(page.getNumber())
                .sort(page.getSort())
                .numberOfElements(page.getNumberOfElements())
                .empty(page.isEmpty())
                .build();
    }
}
