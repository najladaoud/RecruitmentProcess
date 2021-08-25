package tn.inetum.RecruitmentProcess;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@EnableConfigurationProperties
@Data
@ConfigurationProperties("param")
public class Config {

	

	private List<String> familysituation = new ArrayList<>();
	private List<String> diplome = new ArrayList<>();
	private List<String> Etat = new ArrayList<>();
	private List<String> Niveau = new ArrayList<>();
	private List<String> natureBesoin = new ArrayList<>();
	
	public List<String> getFamilysituation() {
		return familysituation;
	}


	public void setFamilysituation(List<String> familysituation) {
		this.familysituation = familysituation;
	}

	public List<String> getDiplome() {
		return diplome;
	}


	public void setDiplome(List<String> diplome) {
		this.diplome = diplome;
	}
	
	public List<String> getEtat() {
		return Etat;
	}


	public void setEtat(List<String> etat) {
		Etat = etat;
	}


	public List<String> getNiveau() {
		return Niveau;
	}


	public void setNiveau(List<String> niveau) {
		Niveau = niveau;
	}


	public List<String> getNatureBesoin() {
		return natureBesoin;
	}


	public void setNatureBesoin(List<String> natureBesoin) {
		this.natureBesoin = natureBesoin;
	}

	@Override
	public String toString() {
		return "Config [familysituation=" + familysituation + ", diplome=" + diplome + ", Etat=" + Etat + ", Niveau="
				+ Niveau + ", natureBesoin=" + natureBesoin + "]";
	}

	
}
