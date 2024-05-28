package com.example.happp_birthday.controller;

import com.example.happp_birthday.model.MailStructure;
import com.example.happp_birthday.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/mail")
public class MailController {

    @Autowired
    private MailService mailService;

    @PostMapping("/send")
    public String sendMail(@RequestBody MailStructure mailStructure){
        mailService.sendMail(mailStructure);
        return "Succeessfully sent the messsage";
    }
}
