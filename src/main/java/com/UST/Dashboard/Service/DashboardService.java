package com.UST.Dashboard.Service;

import com.UST.Dashboard.controller.CandidateConsumer;
import com.UST.Dashboard.controller.InterviewerConsumer;
import com.UST.Dashboard.model.Dashboard;
import com.UST.Dashboard.model.Interviewer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DashboardService {
    @Autowired
    private InterviewerConsumer interviewerConsumer;
    @Autowired
    private CandidateConsumer candidateConsumer;
//
//    List<Interviewer> candidates = interviewerConsumer.getAllInterviewer();
//
//    public List<Dashboard> getDashboardEntries() {
//        List<Dashboard> entries = new ArrayList<>();
//        return entries;
//    }
}
