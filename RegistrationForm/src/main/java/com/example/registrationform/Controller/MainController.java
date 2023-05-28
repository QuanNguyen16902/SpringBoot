package com.example.registrationform.Controller;

import com.example.registrationform.form.AccountForm;
import com.example.registrationform.model.Account;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    private static List<Account> accounts = new ArrayList<>();

    static {
        accounts.add(new Account("hanoistyle02", "hoahaiduong"));
        accounts.add(new Account("vipeer", "mihchia"));
    }

    @Value("${welcome.message}")
    private String message;

    @Value("${error.message}")
    private String errorMessage;

    @RequestMapping(value = { "/index" }, method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("message", message);
        return "index";
    }

    @RequestMapping(value = { "/accountList" }, method = RequestMethod.GET)
    public String accountList(Model model) {
        model.addAttribute("accounts", accounts);
        return "accountList";
    }

    @RequestMapping(value = { "/addAccount" }, method = RequestMethod.GET)
    public String showAddAccountPage(Model model) {
        AccountForm accountForm = new AccountForm();
        model.addAttribute("accountForm", accountForm);
        return "addAccount";
    }
@RequestMapping(value = { "/addAccount" }, method = RequestMethod.POST)
    public String saveAccount(Model model, @ModelAttribute("accountForm") AccountForm accountForm){
    String username = accountForm.getUsername();
    String password = accountForm.getPassword();

    if(username != null && username.length() > 0 && password != null && password.length()>0){
        Account newAccount = new Account(username,password);
        accounts.add(newAccount);

        return "redirect:/accountList";
    }
    model.addAttribute("errorMessage",errorMessage);
    return "addAccount";
}

}
