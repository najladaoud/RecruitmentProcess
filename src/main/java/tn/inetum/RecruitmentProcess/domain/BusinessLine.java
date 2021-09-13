package tn.inetum.RecruitmentProcess.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class BusinessLine {
	
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="BL_ID")
	private long id;
	private String libelle;
	
	@ManyToOne
	@JsonIgnoreProperties("businessLine")
	MeetingPreparation meetingPreparation;

	public BusinessLine() {
		super();
		// TODO Auto-generated constructor stub
	}


	public BusinessLine(String libelle, MeetingPreparation meetingPreparation) {
		super();
		this.libelle = libelle;
		this.meetingPreparation = meetingPreparation;
	}

		public BusinessLine(String libelle) {
		super();
		this.libelle = libelle;
	}
	


	

}
