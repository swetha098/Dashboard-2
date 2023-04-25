package com.UST.Dashboard.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Candidate {
    private Long id;

    private String candidateName;
    private String panNumber;
    private String aadharNumber;
    private int experience;
    private String skills;
    private String role;
    private Date availableDate;
    private String availableTime;
}
