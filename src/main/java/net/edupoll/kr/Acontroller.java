package net.edupoll.kr;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.edupoll.kr.entity.MessageVo;
import net.edupoll.kr.repository.mybatis.MessageDao;

@Controller
public class Acontroller {

	 @Autowired
	 MessageDao messageDao;
	 
	 @RequestMapping("/select/1")
	 public String select1Handle(Model model) {
		 messageDao.selectAll();
		 model.addAttribute("list",messageDao.selectAll());
		 model.addAttribute("cnt",messageDao.countAll());
		 
		 return "home2";
	 }
	 
	 @RequestMapping("/select/2")
	 public String select2Handle(Model model) {
		 messageDao.countBySender();
		 return "home2";
	 }
	 
	 @RequestMapping("/select/3")
	 public String select3Handle(Model model) {
		 messageDao.countBySender2();
		 return "home2";
	 }
	 
	/*
	 * @RequestMapping("/insert/result") public String
	 * insertResultHandle(@ModelAttribute MessageVo vo, Model model) {
	 * vo.setSender("미니"); vo.setReceiver("나히"); vo.setContent("언제 만나 보고싶엉");
	 * 
	 * int r = messageDao.insertOne(vo); model.addAttribute("rst",r);
	 * 
	 * return "insert/result";
	 * 
	 * }
	 */
	 
	 @RequestMapping("/insert/form")
	 public String insertFormHandle() {
		 
		 return "insert/form";
	 }
	 
	 @RequestMapping("/rst")
	 public String resultFormHandle(@ModelAttribute MessageVo vo, Model model) {
		
		 int r = messageDao.insertOne(vo);
		 model.addAttribute("result", r);
		 
		 return "insert/result";
	 }
	 
	 @RequestMapping("/select")
	 public String selectHandle(@RequestParam String sender, Model model) {
		 model.addAttribute("list", messageDao.selectBySender(sender));
	 
		 return "home2";
	 }
	 
	 @RequestMapping("/search")
	 public String searchHandle(@RequestParam String from, @RequestParam String to, Model model) {
		 Map<String, Object> map = new HashMap<>();
		 map.put("from", from);
		 map.put("to", to);
		
		 model.addAllAttributes(map);
		 
		 return "home2";
	 }
	 
	 
}
