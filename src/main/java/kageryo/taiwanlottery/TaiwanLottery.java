package kageryo.taiwanlottery;

import org.bukkit.plugin.java.JavaPlugin;

import net.milkbowl.vault.chat.Chat;
import net.milkbowl.vault.economy.Economy;
import net.milkbowl.vault.economy.EconomyResponse;
import net.milkbowl.vault.permission.Permission;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.RegisteredServiceProvider;

public final class TaiwanLottery extends JavaPlugin {
    public static TaiwanLottery taiwanLottery;
    public static Economy econ = null;
    public static Permission perms = null;
    public static Chat chat = null;

    @Override
    public void onEnable() {
        // Plugin startup logic
        taiwanLottery = this;
        this.getLogger().info("TaiwanLottery Plugin By.K6Dev@DreamFuture-Studio"); // 插件歡迎訊息(檢查是否運作用)

        if (getServer().getPluginManager().getPlugin("Vault") == null) {
            this.getLogger().info("未偵測到經濟系統，請安裝後再試。");
            // 禁用插件
            getServer().getPluginManager().disablePlugin(this);
            return;
        }else{
            this.getLogger().info("經濟系統已啟用。");
        }
    }
}