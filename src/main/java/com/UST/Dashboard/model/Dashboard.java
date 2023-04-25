package com.UST.Dashboard.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="dashboard_tab")
public class Dashboard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int slNo;
    private String candidateName;
    private String interviewerName;
    private String role;
    private String skills;
    private String time;
    private String googleMeetLink;

}
