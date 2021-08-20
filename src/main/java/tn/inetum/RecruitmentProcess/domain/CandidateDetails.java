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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
//@Configuration
//@PropertySource(value="classpath:application.properties")
@Entity
public class CandidateDetails implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="Candidat_Id")
	private Long id;
	private String nom;
	private String prenom;
	private String email;
	private String telephone;
	
	//@Value("#{'${server.family.situation}'.split(',')}")
	//private List<String> Situationfamiliale;
	private String ecole;
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
	//private String contrat;
	private String Disponibilite;
	private String managementDeProjet;
	private long salaire;
	
	//@Value("#{'${experience}'.split(',')}")
	//private List<String> experience;
	
	//@Value("#{'${diplome}'.split(',')}")
	//private List<String> diplome;
	
	@OneToOne(mappedBy="candidateDetails")
	private MeetingPreparation meetingPreparation;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="candidateDetails")
	private List<Contrat> contrat;
	
	@OneToOne
	private DecisionMeeting decisionMeeting;
	
	
	
	
	
}
