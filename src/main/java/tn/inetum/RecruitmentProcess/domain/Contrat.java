package tn.inetum.RecruitmentProcess.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
public class Contrat  {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	private String type;
	
	@ManyToOne
	@JsonIgnoreProperties("contrat")
	CandidateDetails candidateDetails;

	public Contrat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contrat(String type, CandidateDetails candidateDetails) {
		super();
		this.type = type;
		this.candidateDetails = candidateDetails;
	}
	
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public CandidateDetails getCandidateDetails() {
		return candidateDetails;
	}

	public void setCandidateDetails(CandidateDetails candidateDetails) {
		this.candidateDetails = candidateDetails;
	}

	
	
	
	

}
