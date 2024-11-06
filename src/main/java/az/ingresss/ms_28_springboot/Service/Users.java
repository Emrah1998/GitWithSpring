package az.ingresss.ms_28_springboot.Service;

import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class Users {
    private String name;
    private String surname;
    private String dateBirth;
    private CreditCard creditCard;


    public Users(String name,String surname,String dateBirth,CreditCard creditCard){
        this.name=name;
        this.surname=surname;
        this.dateBirth=dateBirth;
        this.creditCard=creditCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public Long cardTocard(CreditCard targetCard, Long amount){
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter the card number you want to pay");
        String PaymentCardNumber = input.nextLine();
        System.out.println("Please, enter the amount you will pay");
        Long AmountDue = input.nextLong();
            if (this.creditCard.getBalance() >= amount) {
                this.creditCard.setBalance(this.creditCard.getBalance() - amount);
                targetCard.setBalance(targetCard.getBalance() + amount);
                System.out.println("Transfer completed successfully. New balance: " + this.creditCard.getBalance());
            } else {
                System.out.println("There is insufficient amount in the balance!");
            }
    return creditCard.balance;
    }
}

