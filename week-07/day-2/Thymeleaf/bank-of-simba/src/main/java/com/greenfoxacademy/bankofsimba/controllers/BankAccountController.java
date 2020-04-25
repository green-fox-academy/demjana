package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BankAccountController {

  private List<BankAccount> listOfBankAccount = new ArrayList<>();

  public BankAccountController() {
    listOfBankAccount.add(new BankAccount("Simba", 2000, "lion", true, "good"));
    listOfBankAccount.add(new BankAccount("Nala", 1000, "lion", "good"));
    listOfBankAccount.add(new BankAccount("Sarafina", 1000, "lion", "good"));
    listOfBankAccount.add(new BankAccount("Pumbaa", 1200, "pig", "good"));
    listOfBankAccount.add(new BankAccount("Timon", 1200, "suricata", "good"));
    listOfBankAccount.add(new BankAccount("Zordon", 1800, "lion", "bad"));
  }

  @RequestMapping(path = "/show", method = RequestMethod.GET)
  public String showOneAccount(Model model, @RequestParam(name = "name", required = false) String name) {

    List<BankAccount> queriedBankAccount;

    if (name != null) {
      queriedBankAccount = filterBankAccountByName(name);
    } else {
      queriedBankAccount = listOfBankAccount;
    }

    model.addAttribute("listOfBankAccount", queriedBankAccount);
    return "index";
  }

  private List<BankAccount> filterBankAccountByName(String name) {
    return listOfBankAccount.stream().filter(bankAccount -> bankAccount.getName().equals(name)).collect(Collectors.toList());
  }


  @RequestMapping(path = "/display", method = RequestMethod.GET)
  public String display(Model model) {
    String string = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
    model.addAttribute("string", string);
    return "display";
  }

  @GetMapping(path = "/accounts")
  public String showTheAllElements(Model model) {
    model.addAttribute("allaccounts", listOfBankAccount);
    model.addAttribute("accountTemplate", new BankAccount());
    return "accounts";
  }

  @PostMapping(path = "/add")
  public String addNewAccount(@ModelAttribute BankAccount bankAccount){
    listOfBankAccount.add(bankAccount);
    return "redirect:/accounts";
  }

  @PostMapping(path = "/raise")
  public String raiseBalance(String selectedAccountName) {
    for (BankAccount account : listOfBankAccount) {
      if (account.getName().equals(selectedAccountName)){
      int holder = account.getBalance();
      if (account.getKing()) {
        holder += 100;
      } else {
        holder += 10;
      }
      account.setBalance(holder);
      }
    }
    return "redirect:/accounts";
  }
}