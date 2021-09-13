package tn.inetum.RecruitmentProcess.ImplServices;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




import tn.inetum.RecruitmentProcess.domain.CandidateDetails;
import tn.inetum.RecruitmentProcess.domain.MeetingPreparation;
import tn.inetum.RecruitmentProcess.repository.CandidateDetailsRepository;
import tn.inetum.RecruitmentProcess.repository.MeetingPreparationRepository;
import tn.inetum.RecruitmentProcess.services.ICandidateDetailsService;

@Service
public class CandidateDetailsServiceImpl implements ICandidateDetailsService{

	 @Autowired
	 CandidateDetailsRepository candidateDetailsRepository;
	 @Autowired 
	 MeetingPreparationRepository meetingPreparationRepository  ;
	
	@Override
	public String ajouterCandidat(CandidateDetails candidateDetails) {
		candidateDetailsRepository.save(candidateDetails);
		return "candidat ajouté";
	}

	@Override
	public CandidateDetails getCandidatById(long id) {
		CandidateDetails cand=candidateDetailsRepository.findById(id).get();
		return cand;
	}

	@Override
	public List<CandidateDetails> getAllCandidat() {
		List<CandidateDetails> cand=candidateDetailsRepository.findAll();
		return  cand;
	}

	@Override
	public void affecterCandidatAEntretien(long CId, long MId) {
		MeetingPreparation preparationMeeting=  meetingPreparationRepository.findById(MId).get();
		CandidateDetails candidat = candidateDetailsRepository.findById(CId).get();
		preparationMeeting.setCandidateDetails(candidat);
		meetingPreparationRepository.save(preparationMeeting);	
		
	}

	  
	
}
