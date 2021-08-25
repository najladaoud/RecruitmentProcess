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

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class MeetingPreparation {
	

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	//@Column(name="recruiter")
	private String nomRecruteur ;
	//@Column(name="Date")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date DateDeLentretien;
	//@Column(name="updateDate")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date DateDeMiseAjour;
	
	private String recommandepar;
	private String cooptepar;
	private String sourcepar;
	
	private String Autrecompetences;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="meetingPreparation")
	@JsonIgnoreProperties("meetingPreparation")
	private List<CandidacyOrigin> CandidacyOrigin;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="meetingPreparation")
	@JsonIgnoreProperties("meetingPreparation")
	private List<BusinessLine> businessLine;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="meetingPreparation")
	@JsonIgnoreProperties("meetingPreparation")
	private List<ProfilSkills> profilskills;
	
	@OneToOne
	private CandidateDetails candidateDetails;

	public MeetingPreparation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
	public MeetingPreparation(String nomRecruteur, Date dateDeLentretien, Date dateDeMiseAjour, String recommandepar,
			String cooptepar, String sourcepar, String autrecompetences,
			List<tn.inetum.RecruitmentProcess.domain.CandidacyOrigin> candidacyOrigin, List<BusinessLine> businessLine,
			List<ProfilSkills> profilskills, CandidateDetails candidateDetails) {
		super();
		this.nomRecruteur = nomRecruteur;
		DateDeLentretien = dateDeLentretien;
		DateDeMiseAjour = dateDeMiseAjour;
		this.recommandepar = recommandepar;
		this.cooptepar = cooptepar;
		this.sourcepar = sourcepar;
		Autrecompetences = autrecompetences;
		CandidacyOrigin = candidacyOrigin;
		this.businessLine = businessLine;
		this.profilskills = profilskills;
		this.candidateDetails = candidateDetails;
	}




	public String getNomRecruteur() {
		return nomRecruteur;
	}

	public void setNomRecruteur(String nomRecruteur) {
		this.nomRecruteur = nomRecruteur;
	}

	public Date getDateDeLentretien() {
		return DateDeLentretien;
	}

	public void setDateDeLentretien(Date dateDeLentretien) {
		DateDeLentretien = dateDeLentretien;
	}

	public Date getDateDeMiseAjour() {
		return DateDeMiseAjour;
	}

	public void setDateDeMiseAjour(Date dateDeMiseAjour) {
		DateDeMiseAjour = dateDeMiseAjour;
	}

	public String getRecommandepar() {
		return recommandepar;
	}

	public void setRecommandepar(String recommandepar) {
		this.recommandepar = recommandepar;
	}

	public String getCooptepar() {
		return cooptepar;
	}

	public void setCooptepar(String cooptepar) {
		this.cooptepar = cooptepar;
	}

	public String getSourcepar() {
		return sourcepar;
	}

	public void setSourcepar(String sourcepar) {
		this.sourcepar = sourcepar;
	}

	public String getAutrecompetences() {
		return Autrecompetences;
	}

	public void setAutrecompetences(String autrecompetences) {
		Autrecompetences = autrecompetences;
	}


	public List<CandidacyOrigin> getCandidacyOrigin() {
		return CandidacyOrigin;
	}

	public void setCandidacyOrigin(List<CandidacyOrigin> candidacyOrigin) {
		CandidacyOrigin = candidacyOrigin;
	}

	public List<BusinessLine> getBusinessLine() {
		return businessLine;
	}

	public void setBusinessLine(List<BusinessLine> businessLine) {
		this.businessLine = businessLine;
	}

	public List<ProfilSkills> getProfilskills() {
		return profilskills;
	}

	public void setProfilskills(List<ProfilSkills> profilskills) {
		this.profilskills = profilskills;
	}

	public CandidateDetails getCandidateDetails() {
		return candidateDetails;
	}

	public void setCandidateDetails(CandidateDetails candidateDetails) {
		this.candidateDetails = candidateDetails;
	}


}
