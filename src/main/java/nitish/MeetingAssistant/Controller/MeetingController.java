package nitish.MeetingAssistant.Controller;

import nitish.MeetingAssistant.DTOs.MeetingDto;
import nitish.MeetingAssistant.Model.User;
import nitish.MeetingAssistant.Service.MeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/meet")
public class MeetingController {
    @Autowired
    MeetingService meetingService;

    @PostMapping("/addUser")
    public String addUser(@RequestBody List<User> users){
       return meetingService.addUser(users);
    }

    @PostMapping("/addMeeting")
    public String addMeet(@RequestBody MeetingDto meetingDto){
        return meetingService.addMeeting(meetingDto);
    }

    @GetMapping("/freeSlots")
    public void getFreeSlots(@RequestBody List<Integer> userIds){

    }
    @GetMapping("/scheduleConflicts")
    public void getFreeSlots(){

    }
    @PutMapping("/cancelMeeting")
    public  void cancelMeeting(@RequestParam("q") Integer meetingId){

    }
}
