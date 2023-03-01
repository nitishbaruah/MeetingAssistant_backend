package nitish.MeetingAssistant.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nitish.MeetingAssistant.Enums.MeetingStatus;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="meetingList")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MeetingList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int MeetingListId;

    private LocalDateTime dateTime;

    @OneToMany(mappedBy = "meetingList",cascade = CascadeType.ALL)
    private List<Meeting> meetings;


}
