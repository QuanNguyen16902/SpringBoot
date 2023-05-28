package com.example.loginregistry.Controller;

import com.example.loginregistry.model.RegistryForm;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class Controller {
    @RequestMapping(value = "/registry",method = RequestMethod.GET)
    public String registry(Model model) {
        RegistryForm registryForm = new RegistryForm();

        model.addAttribute("registryForm",registryForm );
        return "registry";
    }

}
