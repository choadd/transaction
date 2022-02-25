package net.edupoll.kr;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.edupoll.kr.entity.MessageVo;
import net.edupoll.kr.repository.jdbcTemplate.MessageDao;
import oracle.jdbc.proxy.annotation.Post;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@Autowired
	MessageDao messageDao;

	@GetMapping("/data")
	public String login(@ModelAttribute("list") MessageVo vo) {
		messageDao.insert(vo.getSender(), vo.getReceiver(), vo.getContent());
		return "data";
	}


}
