package az.ingresss.ms_28_springboot;

import az.ingresss.ms_28_springboot.Service.CreditCard;
import az.ingresss.ms_28_springboot.Service.Users;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class SourceRoot {

	public static void main(String[] args) {
		SpringApplication.run(SourceRoot.class, args);
		CreditCard user1Card = new CreditCard("1234567890123456", 123, "Emrah Garashov", "14/10/98", 1000L);
		Users user1 = new Users("Emrah", "Garashov", "14-10-1998", user1Card);

		CreditCard user2Card = new CreditCard("9876543210987654", 456, "Ilkin Eliyev", "02/02/92", 500L);
		Users user2 = new Users("Ilkin", "Eliyev", "02-02-1992", user2Card);

		user1.cardTocard(user2Card, 200L);

	}
	}



