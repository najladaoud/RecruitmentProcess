package tn.inetum.RecruitmentProcess.domain;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class DecisionMeeting  {
	

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String Naturebesoin;
	private String Detailsbesoin;
	private String Etat;
	private String Remarque;
	private String capaciteDEcoute;
	private String sensDeLanalyse;
	private String QualiteDAdaptation;
	private String Rigeur;
	private String Dynamisme;
	private String DegreDeMotivation;
	private String NiveauDeFrancais;
	private String RapiditeDeComprehension;
	
	private long noteGeneral;
	private String DecisionEntretienTechnique;	
	private long score;
	
	@OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,mappedBy="decisionMeeting")
	private CandidateDetails candidateDetails;

	public DecisionMeeting() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DecisionMeeting(String naturebesoin, String detailsbesoin, String etat, String remarque,
			String capaciteDEcoute, String sensDeLanalyse, String qualiteDAdaptation, String rigeur, String dynamisme,
			String degreDeMotivation, String niveauDeFrancais, String rapiditeDeComprehension, long noteGeneral,
			String decisionEntretienTechnique, long score, CandidateDetails candidateDetails) {
		super();
		Naturebesoin = naturebesoin;
		Detailsbesoin = detailsbesoin;
		Etat = etat;
		Remarque = remarque;
		this.capaciteDEcoute = capaciteDEcoute;
		this.sensDeLanalyse = sensDeLanalyse;
		QualiteDAdaptation = qualiteDAdaptation;
		Rigeur = rigeur;
		Dynamisme = dynamisme;
		DegreDeMotivation = degreDeMotivation;
		NiveauDeFrancais = niveauDeFrancais;
		RapiditeDeComprehension = rapiditeDeComprehension;
		this.noteGeneral = noteGeneral;
		DecisionEntretienTechnique = decisionEntretienTechnique;
		this.score = score;
		this.candidateDetails = candidateDetails;
	}
	
	
	public String getNaturebesoin() {
		return Naturebesoin;
	}

	public void setNaturebesoin(String naturebesoin) {
		Naturebesoin = naturebesoin;
	}

	public String getDetailsbesoin() {
		return Detailsbesoin;
	}

	public void setDetailsbesoin(String detailsbesoin) {
		Detailsbesoin = detailsbesoin;
	}

	public String getEtat() {
		return Etat;
	}

	public void setEtat(String etat) {
		Etat = etat;
	}

	public String getRemarque() {
		return Remarque;
	}

	public void setRemarque(String remarque) {
		Remarque = remarque;
	}

	public String getCapaciteDEcoute() {
		return capaciteDEcoute;
	}

	public void setCapaciteDEcoute(String capaciteDEcoute) {
		this.capaciteDEcoute = capaciteDEcoute;
	}

	public String getSensDeLanalyse() {
		return sensDeLanalyse;
	}

	public void setSensDeLanalyse(String sensDeLanalyse) {
		this.sensDeLanalyse = sensDeLanalyse;
	}

	public String getQualiteDAdaptation() {
		return QualiteDAdaptation;
	}

	public void setQualiteDAdaptation(String qualiteDAdaptation) {
		QualiteDAdaptation = qualiteDAdaptation;
	}

	public String getRigeur() {
		return Rigeur;
	}

	public void setRigeur(String rigeur) {
		Rigeur = rigeur;
	}

	public String getDynamisme() {
		return Dynamisme;
	}

	public void setDynamisme(String dynamisme) {
		Dynamisme = dynamisme;
	}

	public String getDegreDeMotivation() {
		return DegreDeMotivation;
	}

	public void setDegreDeMotivation(String degreDeMotivation) {
		DegreDeMotivation = degreDeMotivation;
	}

	public String getNiveauDeFrancais() {
		return NiveauDeFrancais;
	}

	public void setNiveauDeFrancais(String niveauDeFrancais) {
		NiveauDeFrancais = niveauDeFrancais;
	}

	public String getRapiditeDeComprehension() {
		return RapiditeDeComprehension;
	}

	public void setRapiditeDeComprehension(String rapiditeDeComprehension) {
		RapiditeDeComprehension = rapiditeDeComprehension;
	}

	public long getNoteGeneral() {
		return noteGeneral;
	}

	public void setNoteGeneral(long noteGeneral) {
		this.noteGeneral = noteGeneral;
	}

	public String getDecisionEntretienTechnique() {
		return DecisionEntretienTechnique;
	}

	public void setDecisionEntretienTechnique(String decisionEntretienTechnique) {
		DecisionEntretienTechnique = decisionEntretienTechnique;
	}

	public long getScore() {
		return score;
	}

	public void setScore(long score) {
		this.score = score;
	}

	public CandidateDetails getCandidateDetails() {
		return candidateDetails;
	}

	public void setCandidateDetails(CandidateDetails candidateDetails) {
		this.candidateDetails = candidateDetails;
	}
	
	
	
	
}
