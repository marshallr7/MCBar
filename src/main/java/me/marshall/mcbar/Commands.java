package me.marshall.mcbar;

import org.bukkit.Color;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Commands implements CommandExecutor {
    // drink give player drink amount
//
//
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            ItemStack corona = new Drinks().alcoholDrink("&6Corona", Color.ORANGE, 1000, 40.6);
            if (player.getInventory().firstEmpty() == -1) {
                player.getWorld().dropItemNaturally(player.getLocation(), corona);
            } else {
                player.getInventory().addItem(corona);
            }

        }
        return true;
    }
}
