package nitish.MeetingAssistant.Repository;

import nitish.MeetingAssistant.Model.MeetingList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeetingListRepository extends JpaRepository<MeetingList,Integer> {
}
