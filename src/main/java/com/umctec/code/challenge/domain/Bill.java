package com.umctec.code.challenge.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import lombok.Data;
import org.hibernate.annotations.Type;

@Data
@Entity
public class Bill {
    @Id
    @Type(type = "org.hibernate.type.UUIDCharType")
    @Column(name = "id", length = 40, updatable = false)
    private UUID id;

    @ManyToOne
    @JsonIgnore
    @PrimaryKeyJoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;

    private Double totalAmount;
}
