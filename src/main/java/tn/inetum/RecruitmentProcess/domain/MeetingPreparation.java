package tn.inetum.RecruitmentProcess.domain;


import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;





@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class MeetingPreparation {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomRecruteur ;
	@JsonFormat(pattern = "yyyy/MM/dd")
	private Date DateDeLentretien;	
	@JsonFormat(pattern = "yyyy/MM/dd")
	private Date DateDeMiseAjour;
	private String recommandepar;
	private String cooptepar;
	private String sourcepar;
	private String Autrecompetences;
	private String NPCandidat;
	private String Poste;
	
	
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
		
	}
	
	


	public MeetingPreparation(String nomRecruteur, Date dateDeLentretien, Date dateDeMiseAjour, String recommandepar,
			String cooptepar, String sourcepar, String autrecompetences, String nPCandidat, String poste,
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
		NPCandidat = nPCandidat;
		Poste = poste;
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
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNPCandidat() {
		return NPCandidat;
	}

	public void setNPCandidat(String nPCandidat) {
		NPCandidat = nPCandidat;
	}
	public String getPoste() {
		return Poste;
	}

	public void setPoste(String poste) {
		Poste = poste;
	}
	

}
