package com.UST.Dashboard.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@AllArgsConstructor
@NoArgsConstructor
@Data


public class DashboardMatch {
    @Id
    private int slNo;
    private String candidateName;
    private String interviewerName;
    private String role;
    private String skills;
    private String time;
    private String googleMeetLink;
}
