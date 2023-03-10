package com.AP.portfolio.Education;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.Date;

@Getter
@Setter
@ToString
@Entity
public class EducationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private TypeOfTitle type;
    private String institution;
    private String description;

    // optionals
    private Date date_of_start;
    private Date date_of_finish;
}
