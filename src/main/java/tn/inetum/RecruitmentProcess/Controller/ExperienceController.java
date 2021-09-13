package tn.inetum.RecruitmentProcess.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.inetum.RecruitmentProcess.ImplServices.ExperienceServiceImpl;

import tn.inetum.RecruitmentProcess.domain.Experience;

@RestController
class ExperienceController {

	
	@Autowired
	 ExperienceServiceImpl experienceServiceImpl;
	 
	 @GetMapping("/Experience")
		public List<Experience> getExperience(){
			return  experienceServiceImpl.findAllExperience();
		}
}
