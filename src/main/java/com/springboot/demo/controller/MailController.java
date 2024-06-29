package com.springboot.demo.controller;

import com.springboot.demo.service.Mailservice;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mails")
@RequiredArgsConstructor
public class MailController {

  private final Mailservice service;

  @PostMapping
  public String sendMail() {
    return service.sendMail();
  }
}
