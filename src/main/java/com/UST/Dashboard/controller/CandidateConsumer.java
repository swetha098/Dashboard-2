package com.UST.Dashboard.controller;

import com.UST.Dashboard.model.Candidate;
import com.UST.Dashboard.model.Interviewer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name="CANDIDATE-FORM")
public interface CandidateConsumer {


    @GetMapping("/interview/getAllCandidates")
    public List<Candidate> getAllCandidates();


}
