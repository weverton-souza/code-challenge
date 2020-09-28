package com.umctec.code.challenge.generic;

import java.util.List;
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
public class ResponsePage<E> {
    private List<E> content;
    private Boolean isPage;
    private String message = "Operation performed successfully";
    private Pageable pageable;
    private Integer totalElements;
    private Integer totalPages;
    private Boolean first;
    private Boolean last;
    private Integer size;
    private Integer number;
    private Sort sort;
    private Integer numberOfElements;
    private Boolean empty;

    private Integer code;
    private HttpStatus status;

    public ResponsePage<E> buildResponse(final Page<E> page, HttpStatus httpStatus) {
        return ResponsePage.<E>builder()
                .content(page.getContent())
                .code(httpStatus.value())
                .status(httpStatus)
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
