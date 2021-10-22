package com.duc.controller;

import java.io.File;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import com.duc.model.EmailInfo;

@Controller
public class EmailController {
	@Autowired
	ServletContext context;
	@Autowired
	JavaMailSender mailSender;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showForm(ModelMap model) {
		model.addAttribute("mail", new EmailInfo());
		return "AttachEmailInput";
	}

	@RequestMapping(value = "send", method = RequestMethod.POST)
	public String sendWithAttach(ModelMap model, @ModelAttribute("mail") EmailInfo mailInfo,
			@RequestParam("attachment") MultipartFile file) {
		try {
			MimeMessage message = mailSender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(message, true);
			helper.setFrom(mailInfo.getFrom());
			helper.setTo(mailInfo.getTo());
			helper.setReplyTo(mailInfo.getFrom());
			helper.setSubject(mailInfo.getSubject());
			helper.setText(mailInfo.getBody(), true);
			if (!file.isEmpty()) {
				String imageUrl = "uploads/" + file.getOriginalFilename();
				String absolutePath = context.getRealPath(imageUrl);
				File uploadFile = new File(absolutePath);
				file.transferTo(uploadFile);
				helper.addAttachment(uploadFile.getName(), uploadFile);
				model.addAttribute("imageUrl", imageUrl);
			}
			mailSender.send(message);
		} catch (Exception ex) {
			model.addAttribute("error", ex.getMessage());
			return "AttachEmailInput";
		}
		return "AttachEmailSuccess";
	}
}