package br.com.rabbitmqspringbootapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

	@Autowired
	OrderQueueSender orderQueueSender;
	
	@PostMapping(value = "api/emails")
	public String enviarEmail(@RequestBody Email email) {
		System.out.println(email);
		orderQueueSender.send(email.toString());
		return "sucesso";
	}
}
