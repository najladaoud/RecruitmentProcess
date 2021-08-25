package tn.inetum.RecruitmentProcess.ImplServices;

import java.util.List;

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
	
	

}
