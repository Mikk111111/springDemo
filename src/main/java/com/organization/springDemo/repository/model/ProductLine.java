package com.organization.springDemo.repository.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "productlines")
@Getter @Setter @NoArgsConstructor @ToString
public class ProductLine {
    @Id
    @Column(name="productline")
    private String productLine;
    @Column(name="textdescription")
    private String textDescription;
    @Transient
    @Column(name="htmldescription")
    private String htmlDescription;
}
