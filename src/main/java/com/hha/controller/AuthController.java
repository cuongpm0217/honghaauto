package com.hha.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*",maxAge=3600)
@RequestMapping("/api/auth")
public class AuthController {

}
