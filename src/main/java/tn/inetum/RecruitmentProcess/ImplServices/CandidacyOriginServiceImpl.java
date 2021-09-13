package tn.inetum.RecruitmentProcess.ImplServices;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import tn.inetum.RecruitmentProcess.domain.CandidacyOrigin;
import tn.inetum.RecruitmentProcess.repository.CandidacyOriginRepository;
import tn.inetum.RecruitmentProcess.services.ICandidacyOriginService;



@Service
public class CandidacyOriginServiceImpl implements ICandidacyOriginService {

	@Autowired
	CandidacyOriginRepository candidacyOriginRepository ; 
	@Override
	public List<CandidacyOrigin> findAllCandidacyOrigin() {
		
		return candidacyOriginRepository.findAll();
	}

}
