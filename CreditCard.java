package src.ecommerce;

import java.time.LocalDate;
import java.util.UUID;

/**
 *
 * @author Toprak
 */

public class CreditCard {
    private UUID id;
    private String creditCardNumber;
    private String securityCode;
    private LocalDate expirationDate;
    private User user;

    public CreditCard(UUID id, User user, String creditCardNumber, String securityCode, LocalDate expirationDate) {
        this.id = id;
        this.user = user;
        this.creditCardNumber = creditCardNumber;
        this.securityCode = securityCode;
        this.expirationDate = expirationDate;
        user.getCreditCards().add(this);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
