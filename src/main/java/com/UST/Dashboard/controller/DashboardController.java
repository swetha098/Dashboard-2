package com.UST.Dashboard.controller;

import com.UST.Dashboard.Repository.DashboardRepo;
import com.UST.Dashboard.Service.DashboardService;
import com.UST.Dashboard.model.Candidate;
import com.UST.Dashboard.model.Dashboard;
import com.UST.Dashboard.model.DashboardMatch;
import com.UST.Dashboard.model.Interviewer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/dashboard")
public class DashboardController {
    @Autowired
    private DashboardRepo repo;
    @Autowired
    private InterviewerConsumer interviewerConsumer;
    @Autowired
    private CandidateConsumer candidateConsumer;

    @Autowired
    private DashboardService dashboardService;

    @GetMapping("/allInterviewerData")

    public List<Interviewer> getAllInterviewers() {
        return interviewerConsumer.getAllInterviewer();
    }

    @GetMapping("/allCandidateData")

    public List<Candidate> getAllCandidates() {return candidateConsumer.getAllCandidates(); }

    @GetMapping("/matches")
    public List<DashboardMatch> getDashboardMatches() {
        List<DashboardMatch> dashboardMatches = new ArrayList<>();

        // get all candidates
        List<Candidate> candidates = candidateConsumer.getAllCandidates();

        // get all interviewers
        List<Interviewer> interviewers = interviewerConsumer.getAllInterviewer();

        // loop through all candidates and find matching interviewers
        for (Candidate candidate : candidates) {
            for (Interviewer interviewer : interviewers) {
                // compare candidate availability date, time and skills with interviewer availability date, time and skills
                if (candidate.getAvailableDate()!=null && candidate.getAvailableDate().equals(interviewer.getAvailableDate())
                        && candidate.getAvailableTime().equals(interviewer.getAvailableTime())
                        && candidate.getRole().equals(interviewer.getInterviewerRole())) {
                    // create dashboard match
                    DashboardMatch dashboardMatch = new DashboardMatch();
                    dashboardMatch.setCandidateName(candidate.getCandidateName());
                    dashboardMatch.setInterviewerName(interviewer.getInterviewerName());
                    dashboardMatch.setRole(interviewer.getInterviewerRole());
                    dashboardMatch.setSkills(candidate.getSkills());
                    dashboardMatch.setTime(candidate.getAvailableTime());
                    // generate a unique Google Meet link using a UUID
                    String uniqueId = UUID.randomUUID().toString().replaceAll("-", "");
                    String googleMeetLink = "https://meet.google.com/" + uniqueId;
                    dashboardMatch.setGoogleMeetLink(googleMeetLink);




                    dashboardMatches.add(dashboardMatch);

                    Dashboard dashboard = new Dashboard();
                    dashboard.setCandidateName(candidate.getCandidateName());
                    dashboard.setInterviewerName(interviewer.getInterviewerName());
                    dashboard.setRole(interviewer.getInterviewerRole());
                    dashboard.setSkills(candidate.getSkills());
                    dashboard.setTime(candidate.getAvailableTime());
                    dashboard.setGoogleMeetLink(googleMeetLink);
                    repo.save(dashboard);
                }
            }
        }
        for (int i = 0; i < dashboardMatches.size(); i++) {
            dashboardMatches.get(i).setSlNo(i + 1);
        }

        return dashboardMatches;
    }

}
