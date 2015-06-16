import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

/**
 * Created by Tino on 16.06.2015.
 */
public class CowshooterPlugin extends JavaPlugin{
    public static Logger log = Logger.getLogger("Minecraft");

    public void onEnable() {
        log.info("[CowShooter] enabling ...");
        getServer().getPluginManager().registerEvents(new CowshooterListener(),this);
    }
}
