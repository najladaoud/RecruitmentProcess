package tn.inetum.RecruitmentProcess.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.inetum.RecruitmentProcess.ImplServices.MeetingPreparationServiceImpl;

import tn.inetum.RecruitmentProcess.domain.MeetingPreparation;

@RestController
public class MeetingPreparationController {


	@Autowired
	MeetingPreparationServiceImpl meetingPreparationServiceImpl ;
	
	@PostMapping("/AddMeeting")
	@CrossOrigin(origins = "http://localhost:4200")
	@ResponseBody
	public String ajouterMettingPreparation(@RequestBody MeetingPreparation meetingPreparation){
		return meetingPreparationServiceImpl.ajouterMeetingPreparation(meetingPreparation);
	}
	
	
	@GetMapping("/getMeetingById/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	@ResponseBody
    public MeetingPreparation getMeetingPreparationById(@PathVariable("id") long id){
		return meetingPreparationServiceImpl.getMeetingPreparationById(id);
		}
	
	
	@GetMapping("/getAllMeeting")
	@CrossOrigin(origins = "http://localhost:4200")
	@ResponseBody
    public List<MeetingPreparation> getAllMeetingPreparation(){
		return meetingPreparationServiceImpl.getAllMeetingPreparation();
		}
	
	@PutMapping("/updateMeeting/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<MeetingPreparation> updateMeeting(@PathVariable("id") long id,@RequestBody MeetingPreparation meetingPreparation) {
        return ResponseEntity.ok().body(meetingPreparationServiceImpl.update(id, meetingPreparation));
        	
    }
	
	
	@DeleteMapping("/delete/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<Long> deleteMeeting(@PathVariable("id") long id) {
        return ResponseEntity.ok().body(meetingPreparationServiceImpl.deleteMeeting(id));
    }
		
}
