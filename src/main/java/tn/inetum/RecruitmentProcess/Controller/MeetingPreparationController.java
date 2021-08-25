package tn.inetum.RecruitmentProcess.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	@ResponseBody
	public String ajouterMettingPreparation(@RequestBody MeetingPreparation meetingPreparation){
		return meetingPreparationServiceImpl.ajouterMeetingPreparation(meetingPreparation);
	}
	@GetMapping("/getMeetingById/{id}")
	@ResponseBody
    public MeetingPreparation getMeetingPreparationById(@PathVariable("id") long id){
		return meetingPreparationServiceImpl.getMeetingPreparationById(id);
		}
	
	
	@GetMapping("/getAllMeeting")
	@ResponseBody
    public List<MeetingPreparation> getAllMeetingPreparation(){
		return meetingPreparationServiceImpl.getAllMeetingPreparation();
		}
		
}
