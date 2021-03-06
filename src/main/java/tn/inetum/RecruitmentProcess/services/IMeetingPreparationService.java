package tn.inetum.RecruitmentProcess.services;


import java.util.List;


import tn.inetum.RecruitmentProcess.domain.MeetingPreparation;

public interface IMeetingPreparationService {

	public String ajouterMeetingPreparation(MeetingPreparation meetingPreparation);
    public MeetingPreparation getMeetingPreparationById(long id);
	public List<MeetingPreparation>  getAllMeetingPreparation();
	public MeetingPreparation update(long id ,MeetingPreparation meetingPreparation);

	public long deleteMeeting(Long id) ;
}
