package br.com.rabbitmqspringbootapi;


import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

	@RabbitListener(queues = {"${queue.order.name}"})
	public void receive(@Payload String fileBody) {
		System.out.println("Order: "+ fileBody);
		
	}
}
