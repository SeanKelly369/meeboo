package controller;

import entity.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import repository.CandidateRepository;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @Autowired
    private CandidateRepository candidateRepository;

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Candidate add(@RequestBody Candidate candidate) {
        return candidateRepository.save(candidate);
    }
}