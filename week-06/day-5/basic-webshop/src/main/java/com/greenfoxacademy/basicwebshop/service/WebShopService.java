package com.greenfoxacademy.basicwebshop.service;

import com.greenfoxacademy.basicwebshop.models.ShopItem;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class WebShopService {
  private List<ShopItem> listOfShopItems;

  public WebShopService() {
    this.listOfShopItems = initAllItems();
  }

  public List<ShopItem> initAllItems() {
    return Arrays.asList(
        new ShopItem("Running shoes", "Nike running shoes for every day sport", 1000, 5, "dress"),
        new ShopItem("Printer", "Some HP printer that will print pages", 3000, 2, "device"),
        new ShopItem("Coca cola", "0.5l standard coke", 25, 0, "food"),
        new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce", 119, 100, "food"),
        new ShopItem("T-shirt", "Blue with a corgi", 300, 1, "dress")
    );
  }

  public List<ShopItem> getListOfShopItems() {
    return listOfShopItems;
  }

  public List<ShopItem> getOnlyAvailable() {
    return listOfShopItems.stream().filter(item -> item.getQuantity() > 0).collect(Collectors.toList());
  }

  public List<ShopItem> getItemsLowToHigh() {
    return listOfShopItems.stream()
        .sorted((item1, item2) -> Float.compare(item1.getPrice(), item2.getPrice())).collect(Collectors.toList());
  }

  public List<ShopItem> getNikeItem() {
    return listOfShopItems.stream()
        .filter(item -> item.getName().toLowerCase().contains("nike") || item.getDescription().toLowerCase().contains("nike"))
        .collect(Collectors.toList());
  }

  public double getAverageStock() {
    return listOfShopItems.stream().mapToDouble(ShopItem::getQuantity).summaryStatistics().getAverage();
  }

  public List<ShopItem> getMostExpensive() {
    return listOfShopItems.stream().sorted(Comparator.comparingDouble(ShopItem::getPrice).reversed()).limit(1).collect(Collectors.toList());
  }

  public List<ShopItem> getSearchedItem(String searchInput) {
    return listOfShopItems.stream()
        .filter(item -> item.getName().toLowerCase().contains(searchInput.toLowerCase()) || item.getDescription().toLowerCase().contains(searchInput.toLowerCase()))
        .collect(Collectors.toList());
  }

  public List<ShopItem> getFilteredItem(String type) {
    return listOfShopItems.stream().filter(item -> item.getType().equals(type)).collect(Collectors.toList());
  }

  public List<ShopItem> getItemsByPrice(String searchMode, int number) {
    switch (searchMode) {
      case "Above":
        return listOfShopItems.stream().filter(item -> item.getPrice() > Float.valueOf(number)).collect(Collectors.toList());
      case "Below":
        return listOfShopItems.stream().filter(item -> item.getPrice() < Float.valueOf(number)).collect(Collectors.toList());
      case "Exactly":
        return listOfShopItems.stream().filter(item -> item.getPrice() == Float.valueOf(number)).collect(Collectors.toList());
    }
    return null;
  }

  public void changePricesToEuro() {
    ShopItem.isOriginalCurrency = false;
    this.listOfShopItems = initAllItems();
  }

  public void changePricesToOriginalCurrency() {
    ShopItem.isOriginalCurrency = true;
    this.listOfShopItems = initAllItems();
  }
}
