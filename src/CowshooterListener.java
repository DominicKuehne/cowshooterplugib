import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Creature;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;
import sun.plugin2.main.server.Plugin;

/**
 * Created by Tino on 16.06.2015.
 */
public class CowshooterListener implements Listener {

    private JavaPlugin plugin;

    public CowshooterListener(JavaPlugin myPlugin){
        plugin = myPlugin;
    }

    @EventHandler
    public void onInteract (PlayerInteractEvent event) {

        if (event.getAction() == Action.LEFT_CLICK_AIR ||
                event.getAction() == Action.LEFT_CLICK_BLOCK) {

            Player p = event.getPlayer();

            if (p.getItemInHand().getType() == Material.LEATHER) {

                Location loc = p.getLocation();

                Vector v = loc.getDirection().multiply(3.5);

                Cow c = p.getWorld().spawn(loc, Cow.class);
                c.setVelocity(v);

                c.setFireTicks(75);

                BukkitRunnable task = new CowTask(p.getWorld(),c);

                task.runTaskTimer(plugin,1L,0L);

            }

        }

    }

}
