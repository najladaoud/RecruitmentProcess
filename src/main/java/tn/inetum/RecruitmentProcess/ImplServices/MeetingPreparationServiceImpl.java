package tn.inetum.RecruitmentProcess.ImplServices;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.inetum.RecruitmentProcess.domain.MeetingPreparation;
import tn.inetum.RecruitmentProcess.repository.MeetingPreparationRepository;
import tn.inetum.RecruitmentProcess.services.IMeetingPreparationService;

@Service
public class MeetingPreparationServiceImpl implements IMeetingPreparationService {

	
	@Autowired
	MeetingPreparationRepository meetingPreparationRepository ;
	
	@Override
	public String ajouterMeetingPreparation(MeetingPreparation meetingPreparation) {
		 meetingPreparationRepository.save(meetingPreparation);
		 return "Rendez vous ajouté";
	}

	@Override
	public MeetingPreparation getMeetingPreparationById(long id) {
		 MeetingPreparation M= meetingPreparationRepository.findById(id).get();
		return M;
	}

	@Override
	public List<MeetingPreparation> getAllMeetingPreparation() {
		List<MeetingPreparation> M= meetingPreparationRepository.findAll();
		return M;
	}

	@Override
	public MeetingPreparation update( long id ,MeetingPreparation meetingPreparation) {
		
			Optional<MeetingPreparation> Mupdate = meetingPreparationRepository.findById(id);
			if(Mupdate.isPresent()) {
				MeetingPreparation existingMP= Mupdate.get();
				existingMP.setNomRecruteur(meetingPreparation.getNomRecruteur());
				existingMP.setRecommandepar(meetingPreparation.getRecommandepar());
				existingMP.setCooptepar(meetingPreparation.getCooptepar());
				existingMP.setSourcepar(meetingPreparation.getSourcepar());
				existingMP.setDateDeLentretien(meetingPreparation.getDateDeLentretien());
				existingMP.setDateDeMiseAjour(meetingPreparation.getDateDeMiseAjour());
				/*existingMP.setAutrecompetences(meetingPreparation.getAutrecompetences());*/
				existingMP.setNPCandidat(meetingPreparation.getNPCandidat());
				existingMP.setPoste(meetingPreparation.getPoste());
				return meetingPreparationRepository.save(existingMP);
		
		}
			return null;
			
		
	}

	@Override
	public long deleteMeeting(Long id) {
		
			Optional<MeetingPreparation> meetingPreparation =meetingPreparationRepository.findById(id);
			if(meetingPreparation.isPresent()) {
				meetingPreparationRepository.delete(meetingPreparation.get());
				return id;
			}
			return -1;
		
	}
	
	
	
	
	

}
