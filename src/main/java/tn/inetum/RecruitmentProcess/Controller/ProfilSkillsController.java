package tn.inetum.RecruitmentProcess.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.inetum.RecruitmentProcess.ImplServices.ProfilSkillsServiceImpl;
import tn.inetum.RecruitmentProcess.domain.ProfilSkills;


@RestController
public class ProfilSkillsController {
	
 @Autowired
 ProfilSkillsServiceImpl profilSkillsServiceImpl;
 
 @GetMapping("/ProfilSkills")
	public List<ProfilSkills> getProfilSkills(){
		return  profilSkillsServiceImpl.findAllProfilSkills();
	}

}
