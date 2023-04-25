package com.UST.Dashboard.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Interviewer{

    private Long id;
    private String interviewerId;
    private String interviewerName;
    private String interviewerEmail;
    private String interviewerRole;
    private String interviewerSkills;
    private String interviewerExperience;
    private Date availableDate;
    private String availableTime;


}
