package tn.inetum.RecruitmentProcess.ImplServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.inetum.RecruitmentProcess.domain.ProfilSkills;
import tn.inetum.RecruitmentProcess.repository.ProfilSkillsRepository;
import tn.inetum.RecruitmentProcess.services.IProfilSkillsService;

@Service
public class ProfilSkillsServiceImpl implements IProfilSkillsService{

	@Autowired
	ProfilSkillsRepository profilSkillsRepository;
	
	@Override
	public List<ProfilSkills> findAllProfilSkills() {
		
		return profilSkillsRepository.findAll();
	}

}
