package tn.inetum.RecruitmentProcess.ImplServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.inetum.RecruitmentProcess.domain.CandidateDetails;
import tn.inetum.RecruitmentProcess.domain.DecisionMeeting;
import tn.inetum.RecruitmentProcess.domain.MeetingPreparation;
import tn.inetum.RecruitmentProcess.repository.CandidateDetailsRepository;
import tn.inetum.RecruitmentProcess.repository.IDecisionMeetingRepository;
import tn.inetum.RecruitmentProcess.services.IDecisionMeetingService;

@Service
public class DecisionMeetingServiceImpl implements IDecisionMeetingService {

	
	@Autowired
	IDecisionMeetingRepository  decisionMeetingRepository;
	@Autowired 
	CandidateDetailsRepository candidateDetailsRepository;
	
	@Override
	public String ajouterDecisionMeeting(DecisionMeeting decisionMeeting) {
		decisionMeetingRepository.save(decisionMeeting);
		 return "Décision entretien ajouté";
	}

	@Override
	public DecisionMeeting getDecisionMeetingById(long id) {
		//DecisionMeeting D=decisionMeetingRepository.findById(id).get();
		return decisionMeetingRepository.findById(id).orElseThrow(() -> new RuntimeException());
	}

	@Override
	public List<DecisionMeeting> getAllDecisionMeeting() {
		List<DecisionMeeting> D = decisionMeetingRepository.findAll();
		return D;
	}

	@Override
	public void affecterDecisionACandidat(long CId, long DId) {
		
			CandidateDetails candidateDetails=  candidateDetailsRepository.findById(CId).get();
			DecisionMeeting decisionMeeting = decisionMeetingRepository.findById(DId).get();
			
			candidateDetails.setDecisionMeeting(decisionMeeting);
			candidateDetailsRepository.save(candidateDetails);	
			
		
	}
	
}
