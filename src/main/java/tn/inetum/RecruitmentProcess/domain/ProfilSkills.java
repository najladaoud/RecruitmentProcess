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

}
