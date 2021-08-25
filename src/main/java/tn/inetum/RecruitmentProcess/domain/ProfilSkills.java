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

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProfilSkills {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="PS_ID")
	private long id;
	private String libelle;
	
	@ManyToOne
	MeetingPreparation meetingPreparation;

	public ProfilSkills() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProfilSkills(String libelle, MeetingPreparation meetingPreparation) {
		super();
		this.libelle = libelle;
		this.meetingPreparation = meetingPreparation;
	}
	
	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public MeetingPreparation getMeetingPreparation() {
		return meetingPreparation;
	}

	public void setMeetingPreparation(MeetingPreparation meetingPreparation) {
		this.meetingPreparation = meetingPreparation;
	}

	
	
	
	
	

}
