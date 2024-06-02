package tn.esprit.PIDEV.services;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import tn.esprit.PIDEV.entities.User;
import tn.esprit.PIDEV.repositories.UserRepository;
import java.util.Random;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service

@Slf4j
public class PhoneVerificationService {



    /*public PhoneVerificationService() {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
    }*/

    public void sendVerificationCode(String phoneNumber, String verificationCode) {
      /*  Message.creator(
                        new PhoneNumber(phoneNumber),
                        new PhoneNumber(TWILIO_PHONE_NUMBER),
                        "Your verification code is: " + verificationCode)
                .create();
    */}

    public boolean verifyCode(String userInputCode, String storedVerificationCode) {
        return userInputCode.equals(storedVerificationCode);
    }
}
