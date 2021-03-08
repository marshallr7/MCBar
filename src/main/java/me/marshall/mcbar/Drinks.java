package me.marshall.mcbar;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.persistence.PersistentDataType;

import java.util.ArrayList;
import java.util.List;

public class Drinks {

    public ItemStack alcoholDrink(String drinkName, Color color, int cost, double percent) {
        ItemStack drink = new ItemStack(Material.POTION);
        PotionMeta meta = (PotionMeta) drink.getItemMeta();
        meta.setColor(color);
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', drinkName));
        List<String> Lore = new ArrayList<>();
        Lore.add(ChatColor.translateAlternateColorCodes('&', "&2Price: &7" + cost));
        Lore.add(ChatColor.translateAlternateColorCodes('&', "&2Alcohol Percentage: &7" + percent + "%"));
        meta.setLore(Lore);
        NamespacedKey key = new NamespacedKey(MCBar.getInstance(), "drink");
        meta.getPersistentDataContainer().set(key, PersistentDataType.DOUBLE, percent);
        meta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
        drink.setItemMeta(meta);
        return drink;
    }

//    public ItemStack gambleDrink(String drinkName, int amount) {
//
//    }
}
