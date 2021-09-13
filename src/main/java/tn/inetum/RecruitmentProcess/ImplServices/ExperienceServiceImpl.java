package tn.inetum.RecruitmentProcess.ImplServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.inetum.RecruitmentProcess.domain.Experience;
import tn.inetum.RecruitmentProcess.repository.ExperienceRepository;
import tn.inetum.RecruitmentProcess.services.IExperienceService;

@Service
public class ExperienceServiceImpl implements  IExperienceService{

	
	@Autowired
	private ExperienceRepository experienceRepository ;
	@Override
	public List<Experience> findAllExperience() {
		
		return experienceRepository.findAll();
	}

}
