package dev.ignacio.villarreal.authenticationapi.api.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/auth")
public class test {

    @GetMapping("/verify")
    public String verifyUser(@RequestParam("token") String token, Model model) {
        boolean valid = "123abc".equals(token); // Ejemplo de validación

        if (valid) {
            model.addAttribute("message", "Tu cuenta ha sido activada con éxito.");
            return "verify-success"; // busca verify-success.html en /templates
        } else {
            model.addAttribute("message", "El enlace no es válido o expiró.");
            return "verify-error";
        }
    }
}
