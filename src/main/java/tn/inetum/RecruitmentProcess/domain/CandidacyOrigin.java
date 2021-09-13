package tn.inetum.RecruitmentProcess.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToOne;



@Entity
public class CandidacyOrigin {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="CO_ID")
	private long id;
	private String libelle;
	
	@ManyToOne
	MeetingPreparation meetingPreparation;
	
}
