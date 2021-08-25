package tn.inetum.RecruitmentProcess.services;

import java.util.List;

import tn.inetum.RecruitmentProcess.domain.CandidateDetails;



public interface ICandidateDetailsService {
	
	public String ajouterCandidat(CandidateDetails candidateDetails);
	
	public CandidateDetails getCandidatById(long id);
	
	public List<CandidateDetails>  getAllCandidat();
	public void affecterCandidatAEntretien(long CId, long MID);

	
}
