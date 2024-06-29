package com.springboot.demo.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class Mailservice {

  private final JavaMailSender mailSender;

  public String sendMail() {
    try {
      var mimeMessage = mailSender.createMimeMessage();
      var message = new MimeMessageHelper(mimeMessage);
      var content = """
        <html>
        <h1>This is a Test Email</h1>
        <p>Please do not respond to this email.</p>
        </html>
        """;
      message.setFrom("noreply@abhishekdev.org");
      message.setTo("abhisheksde@gmail.com");
      message.setSubject("Test email");
      message.setText(content, true);
      mailSender.send(message.getMimeMessage());
    } catch (Exception exp) {
      log.error("Exception caught while sending the mail.", exp);
      return "Mail not sent successfully!!";
    }
    return "Mail sent successfully!!";
  }

}
