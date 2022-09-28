package kageryo.taiwanlottery;

import org.bukkit.plugin.java.JavaPlugin;

public final class TaiwanLottery extends JavaPlugin {
    public static TaiwanLottery taiwanLottery;
    @Override
    public void onEnable() {
        // Plugin startup logic
        taiwanLottery=this;
        this.getLogger().info("TaiwanLottery Plugin By.K6Dev@DreamFuture-Studio"); // 插件歡迎訊息(檢查是否運作用)
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
