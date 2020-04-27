package com.greenfoxacademy.basicwebshop.controllers;

import com.greenfoxacademy.basicwebshop.service.WebShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebShopController {

  private WebShopService webShopService;

  @Autowired
  public WebShopController(WebShopService webShopService) {
    this.webShopService = webShopService;
  }

  @ResponseBody
  @GetMapping(value = "/webshop")
  public String greeting() {
    return "Hello World";
  }

  @GetMapping(value = {"", "/My Shop"})
  public String goToHomePage(Model model) {
    model.addAttribute("items", webShopService.getListOfShopItems());
    return "index";
  }

  @GetMapping(value = "/only-available")
  public String getOnlyAvailable(Model model) {
    model.addAttribute("items", webShopService.getOnlyAvailable());
    return "index";
  }

  @GetMapping(value = "/cheapest-first")
  public String sortAscendingOrderByPrice(Model model) {
    model.addAttribute("items", webShopService.getItemsLowToHigh());
    return "index";
  }

  @GetMapping(value = "/contains-nike")
  public String getItemsWhichAreNikes(Model model) {
    model.addAttribute("items", webShopService.getNikeItem());
    return "index";
  }

  @GetMapping(value = "/average-stock")
  public String getAverageStock(Model model) {
    model.addAttribute("averageStock", webShopService.getAverageStock());
    return "averagestock";
  }

  @GetMapping(value = "/most-expensive")
  public String getMostExpensiveItem(Model model) {
    model.addAttribute("items", webShopService.getMostExpensive());
    return "index";
  }

  @PostMapping(value = "/search")
  public String searchByName(String searchInput, Model model) {
    model.addAttribute("items", webShopService.getSearchedItem(searchInput));
    return "index";
  }

  @GetMapping(value = "/more-filters")
  public String goToMoreFilters(Model model) {
    model.addAttribute("items", webShopService.getListOfShopItems());
    return "morefilters";
  }

  @GetMapping(value = "/filter-by-type/{type}")
  public String filterByType(Model model, @PathVariable String type) {
    model.addAttribute("items", webShopService.getFilteredItem(type));
    return "morefilters";
  }

  @PostMapping(path = "/search-by-price")
  public String searchByPrice(@RequestParam String searchMode,
                              @RequestParam(defaultValue = "0") float number,
                              Model model) {
    model.addAttribute("items", webShopService.getItemsByPrice(searchMode, number));
    return "morefilters";
  }

  @GetMapping(value = "/price-in-eur")
  public String getPricesInEuro(Model model) {
    webShopService.changePricesToEuro();
    model.addAttribute("items", webShopService.getListOfShopItems());
    return "morefilters";
  }

  @GetMapping(value = "/price-in-original")
  public String getPricesInOriginalCurrency(Model model) {
    webShopService.changePricesToOriginalCurrency();
    model.addAttribute("items", webShopService.getListOfShopItems());
    return "morefilters";
  }
}