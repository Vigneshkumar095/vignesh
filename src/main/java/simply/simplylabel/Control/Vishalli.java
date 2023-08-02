package simply.simplylabel.Control;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Vishalii {

@Autowired
private Busprocess busRepo;

public Vishalii(Busprocess busRepo) {
	this.busRepo = busRepo;
}
@GetMapping("/findall")
public List<Bus> process()
{
	return busRepo.findAll();
}
@PostMapping("/save")
public void add(@RequestBody Bus bus) {
	 busRepo.save(bus);
}
}

