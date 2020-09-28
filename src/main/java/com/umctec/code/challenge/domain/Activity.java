package com.umctec.code.challenge.domain;

import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.Data;
import org.hibernate.annotations.Type;

@Data
@Entity
public class Activity {
    @Id
    @Type(type = "org.hibernate.type.UUIDCharType")
    @Column(name = "id", length = 40, updatable = false)
    private UUID id;

    private String title;

    private String subTitle;

    private Integer sla;

    @OneToOne
    private Patient patient;

    @OneToOne
    private Visit visit;
}
