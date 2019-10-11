package edu.mum.cs.cs425.demo.service.implemention;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.cs.cs425.demo.model.ClassRoom;
import edu.mum.cs.cs425.demo.repository.ClassRommRepository;
import edu.mum.cs.cs425.demo.service.IClassRoomService;

@Service
public class ClassRoomService implements IClassRoomService {


    @Autowired
    private ClassRommRepository classRoomRepo;

    @Override
    public ClassRoom saveClassRoon(ClassRoom clasRoom) {
        return classRoomRepo.save(clasRoom);
    }

    @Override
    public ClassRoom getClassRoomById(int classRoomId) {
        return classRoomRepo.findById(classRoomId).orElse(null);
    }
    
}