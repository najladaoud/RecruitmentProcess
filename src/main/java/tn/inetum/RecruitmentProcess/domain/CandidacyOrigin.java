package tn.inetum.RecruitmentProcess.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


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
