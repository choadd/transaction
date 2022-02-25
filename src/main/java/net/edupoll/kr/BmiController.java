package net.edupoll.kr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.edupoll.kr.entity.BodyMassVO;
import net.edupoll.kr.repository.jdbcTemplate.BodymassDAOImpl;

@Controller
public class BmiController {

	@Autowired
	BodymassDAOImpl body;

	@GetMapping("/")
	public String view() {
		return "/welcome";
	}

	@PostMapping("/home")
	public String result(@ModelAttribute("result") BodyMassVO vo, Model model) {
		body.insertData(vo.getCm(), vo.getKg(), vo.getAge(),vo.getRate(),vo.getResult());

		model.addAttribute("list",body.info());
		
		System.out.println("testtest");
		return "/home";
	}

}
