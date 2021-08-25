package tn.inetum.RecruitmentProcess.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Experience{
	

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String libelle;
	
	@ManyToOne
	CandidateDetails candidateDetails;
	
	
	
	public Experience() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Experience(String libelle, CandidateDetails candidateDetails) {
		super();
		this.libelle = libelle;
		this.candidateDetails = candidateDetails;
	}



	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public CandidateDetails getCandidateDetails() {
		return candidateDetails;
	}

	public void setCandidateDetails(CandidateDetails candidateDetails) {
		this.candidateDetails = candidateDetails;
	}
	
}
