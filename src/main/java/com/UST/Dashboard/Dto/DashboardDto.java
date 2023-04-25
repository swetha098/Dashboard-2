package com.UST.Dashboard.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DashboardDto {
    private int SlNo;
    private String CandidateName;
    private String skills;
    private String InterviewerName;
    private String Time;
    private String GoogleMeetLink;
}
