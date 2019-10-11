package edu.mum.cs.cs425.demo.service;

import edu.mum.cs.cs425.demo.model.ClassRoom;

public interface IClassRoomService {
    ClassRoom saveClassRoon(ClassRoom clasRoom);
    ClassRoom getClassRoomById(int classRoomId);
    
}