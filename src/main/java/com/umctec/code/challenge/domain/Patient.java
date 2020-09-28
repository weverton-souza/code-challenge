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
public class Patient {
    @Id
    @Type(type = "org.hibernate.type.UUIDCharType")
    @Column(name = "id", length = 40, updatable = false)
    private UUID id;

    @OneToOne
    private HealthInsurance healthInsurance;

    @OneToOne
    private Customer customer;
}
