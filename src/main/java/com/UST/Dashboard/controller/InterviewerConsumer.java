package com.UST.Dashboard.controller;


import com.UST.Dashboard.model.Candidate;
import com.UST.Dashboard.model.Interviewer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "INTERVIEWER-FORM")
public interface InterviewerConsumer {

    @GetMapping("/interviews/getdetails")
    public List<Interviewer> getAllInterviewer();




//    @GetMapping("/book/{id}")
//    public Interviewer getBookById(@PathVariable Integer id);


}
