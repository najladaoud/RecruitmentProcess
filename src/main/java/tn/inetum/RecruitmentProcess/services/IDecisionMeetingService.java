package tn.inetum.RecruitmentProcess.services;

import java.util.List;

import tn.inetum.RecruitmentProcess.domain.DecisionMeeting;


public interface IDecisionMeetingService {
	public String ajouterDecisionMeeting(DecisionMeeting decisionMeeting);
	public DecisionMeeting getDecisionMeetingById(long id);
	public List<DecisionMeeting>  getAllDecisionMeeting();
	public void affecterDecisionACandidat(long CId, long DId);

}
