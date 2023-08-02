package simply.simplylabel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Busprocess extends JpaRepository<Bus,String> {

	
}

