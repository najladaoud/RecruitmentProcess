package tn.inetum.RecruitmentProcess.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class MeetingPreparation implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="recruiter")
	private String nomRecruteur ;
	@Column(name="Date")
	private Date DateDeLentretien;
	@Column(name="updateDate")
	private Date DateDeMiseAjour;
	
	private String recommandepar;
	private String cooptepar;
	private String sourcepar;
	
	private String Autrecompetences;
	private String Motivationsetattentes;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="meetingPreparation")
	private List<CandidacyOrigin> CandidacyOrigin;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="meetingPreparation")
	private List<BusinessLine> businessLine;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="meetingPreparation")
	private List<ProfilSkills> profilskills;
	
	@OneToOne
	private CandidateDetails candidateDetails;
	
	
	
	

}
