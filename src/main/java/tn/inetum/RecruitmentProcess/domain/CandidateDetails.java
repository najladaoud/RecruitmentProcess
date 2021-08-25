package tn.inetum.RecruitmentProcess.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class CandidateDetails  {


	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	//@Column(name="Candidat_Id")
	private Long id;
	private String nom;
	private String prenom;
	private String email;
	private String telephone;
	private String situationFamiliale;	
	private String ecole;
	@JsonFormat(pattern="yyyy")
	private Date annee;
	private String poste;
	private String employeurActuel;
	private String PosteActuel;
	private String CauserechercheEtObjectifs;
	private String MotivationsEtAttentes;
	private String NiveauAnglais;
	private String agileScrum;
	private String certification;
	private String managementDeLequipe;
	private String valeursAjoutees;
	private String Disponibilite;
	private String managementDeProjet;
	private long salaire;
	private String diplome;
	
	@OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy="candidateDetails")
	private MeetingPreparation meetingPreparation;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="candidateDetails")
	@JsonIgnoreProperties("candidateDetails")
	private List<Contrat> contrat;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="candidateDetails")
	@JsonIgnoreProperties("candidateDetails")
	private List<Experience> experience;
	
	@OneToOne
	private DecisionMeeting decisionMeeting;

	
	
	public CandidateDetails() {
		super();
		// TODO Auto-generated constructor stub
	}



	public CandidateDetails(String nom, String prenom, String email, String telephone, String situationFamiliale,
			String ecole, Date annee, String poste, String employeurActuel, String posteActuel,
			String causerechercheEtObjectifs, String motivationsEtAttentes, String niveauAnglais, String agileScrum,
			String certification, String managementDeLequipe, String valeursAjoutees, String disponibilite,
			String managementDeProjet, long salaire, String diplome, MeetingPreparation meetingPreparation,
			List<Contrat> contrat, List<Experience> experience, DecisionMeeting decisionMeeting) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.situationFamiliale = situationFamiliale;
		this.ecole = ecole;
		this.annee = annee;
		this.poste = poste;
		this.employeurActuel = employeurActuel;
		PosteActuel = posteActuel;
		CauserechercheEtObjectifs = causerechercheEtObjectifs;
		MotivationsEtAttentes = motivationsEtAttentes;
		NiveauAnglais = niveauAnglais;
		this.agileScrum = agileScrum;
		this.certification = certification;
		this.managementDeLequipe = managementDeLequipe;
		this.valeursAjoutees = valeursAjoutees;
		Disponibilite = disponibilite;
		this.managementDeProjet = managementDeProjet;
		this.salaire = salaire;
		this.diplome = diplome;
		this.meetingPreparation = meetingPreparation;
		this.contrat = contrat;
		this.experience = experience;
		this.decisionMeeting = decisionMeeting;
	}









	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}


	public String getSituationFamiliale() {
		return situationFamiliale;
	}



	public void setSituationFamiliale(String situationFamiliale) {
		this.situationFamiliale = situationFamiliale;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getTelephone() {
		return telephone;
	}



	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}



	



	public String getEcole() {
		return ecole;
	}



	public void setEcole(String ecole) {
		this.ecole = ecole;
	}



	public Date getAnnee() {
		return annee;
	}



	public void setAnnee(Date annee) {
		this.annee = annee;
	}



	public String getPoste() {
		return poste;
	}



	public void setPoste(String poste) {
		this.poste = poste;
	}



	public String getEmployeurActuel() {
		return employeurActuel;
	}



	public void setEmployeurActuel(String employeurActuel) {
		this.employeurActuel = employeurActuel;
	}



	public String getPosteActuel() {
		return PosteActuel;
	}



	public void setPosteActuel(String posteActuel) {
		PosteActuel = posteActuel;
	}



	public String getCauserechercheEtObjectifs() {
		return CauserechercheEtObjectifs;
	}



	public void setCauserechercheEtObjectifs(String causerechercheEtObjectifs) {
		CauserechercheEtObjectifs = causerechercheEtObjectifs;
	}



	public String getMotivationsEtAttentes() {
		return MotivationsEtAttentes;
	}



	public void setMotivationsEtAttentes(String motivationsEtAttentes) {
		MotivationsEtAttentes = motivationsEtAttentes;
	}



	public String getNiveauAnglais() {
		return NiveauAnglais;
	}



	public void setNiveauAnglais(String niveauAnglais) {
		NiveauAnglais = niveauAnglais;
	}



	public String getAgileScrum() {
		return agileScrum;
	}



	public void setAgileScrum(String agileScrum) {
		this.agileScrum = agileScrum;
	}



	public String getCertification() {
		return certification;
	}



	public void setCertification(String certification) {
		this.certification = certification;
	}



	public String getManagementDeLequipe() {
		return managementDeLequipe;
	}



	public void setManagementDeLequipe(String managementDeLequipe) {
		this.managementDeLequipe = managementDeLequipe;
	}



	public String getDisponibilite() {
		return Disponibilite;
	}



	public void setDisponibilite(String disponibilite) {
		Disponibilite = disponibilite;
	}



	public String getManagementDeProjet() {
		return managementDeProjet;
	}



	public void setManagementDeProjet(String managementDeProjet) {
		this.managementDeProjet = managementDeProjet;
	}



	public long getSalaire() {
		return salaire;
	}



	public void setSalaire(long salaire) {
		this.salaire = salaire;
	}



	public String getDiplome() {
		return diplome;
	}



	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}



	public MeetingPreparation getMeetingPreparation() {
		return meetingPreparation;
	}



	public void setMeetingPreparation(MeetingPreparation meetingPreparation) {
		this.meetingPreparation = meetingPreparation;
	}



	public List<Contrat> getContrat() {
		return contrat;
	}



	public void setContrat(List<Contrat> contrat) {
		this.contrat = contrat;
	}



	public List<Experience> getExperience() {
		return experience;
	}



	public void setExperience(List<Experience> experience) {
		this.experience = experience;
	}



	public DecisionMeeting getDecisionMeeting() {
		return decisionMeeting;
	}



	public void setDecisionMeeting(DecisionMeeting decisionMeeting) {
		this.decisionMeeting = decisionMeeting;
	}
	
	public String getValeursAjoutees() {
		return valeursAjoutees;
	}




	public void setValeursAjoutees(String valeursAjoutees) {
		this.valeursAjoutees = valeursAjoutees;
	}


	
	
	
	
	
}
