package com.freelancer.freelancer.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import java.sql.Timestamp;

import javax.persistence.*;

@Data
@Entity
@Table(name = "work")
@JsonIgnoreProperties(value = {"handler","hibernateLazyInitializer","fieldHandler"})
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "wId")
public class Work {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int wId;
    private String title;
    private Double paymentLower;
    private Double paymentHigher;
    private Timestamp biddingDdl;
    private Timestamp finishDdl;
    private String description;
    private int status;

}
