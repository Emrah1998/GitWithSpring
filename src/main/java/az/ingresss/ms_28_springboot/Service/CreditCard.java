package az.ingresss.ms_28_springboot.Service;

import org.springframework.stereotype.Service;

@Service
public class CreditCard {

    private String cardNumber;
    private Integer ccv;
    private String owner;
    private String expiryDate;
    Long balance ;
    private Users users;

        public CreditCard(String cardNumber, Integer ccv, String owner, String expiryDate, Long balance) {
        this.cardNumber = cardNumber;
        this.ccv = ccv;
        this.owner = owner;
        this.expiryDate = expiryDate;
        this.balance = balance;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Integer getCcv() {
        return ccv;
    }

    public void setCcv(Integer ccv) {
        this.ccv = ccv;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }
}
