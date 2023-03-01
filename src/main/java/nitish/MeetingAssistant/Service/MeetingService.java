package nitish.MeetingAssistant.Service;

import nitish.MeetingAssistant.DTOs.MeetingDto;
import nitish.MeetingAssistant.Model.User;
import nitish.MeetingAssistant.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MeetingService {
    @Autowired
    UserRepository userRepository;

    public String addUser(List<User> users){
        for(User user:users){
            userRepository.save(user);
        }
        return "Users Added Successfully";
    }

    public String addMeeting(MeetingDto meetingDto){

        return "";
    }
}
