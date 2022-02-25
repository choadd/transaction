package net.edupoll.kr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.edupoll.kr.entity.AccountVo;
import net.edupoll.kr.entity.PointVo;
import net.edupoll.kr.repository.mybatis.AccountDao;
import net.edupoll.kr.repository.mybatis.PointDao;
import net.edupoll.kr.service.AccountService;

@Controller
public class AccountController {

	@Autowired
	AccountService accountService;

	@RequestMapping("/exam/insertAc")
	public String insertAccount() {
		System.out.println("1");
		return "exam/hello";
		// 만약 view로 사용할 값을 리턴하지 않으면 요청경로를 뷰 이름으로 사용한다
	}

	@GetMapping("/exam/rst")
	public String insertResult(@ModelAttribute AccountVo vo, Model model) {

		boolean result = accountService.registerNewOne(vo);

		model.addAttribute("result", result);
//		model.addAttribute("list", dao.selectAll());

		return "exam/rst";
	}

}
