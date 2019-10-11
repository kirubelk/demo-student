package edu.mum.cs.cs425.demo.service.implemention;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.cs.cs425.demo.model.Transcript;
import edu.mum.cs.cs425.demo.repository.TranscriptRepository;
import edu.mum.cs.cs425.demo.service.ITranscriptService;

@Service
public class TranscriptService implements ITranscriptService {

    @Autowired
    private TranscriptRepository transRepo;

    @Override
    public Transcript saveTranscript(Transcript trans) {
        return transRepo.save(trans);
    }
    
}