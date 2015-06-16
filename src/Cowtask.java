import org.bukkit.World;
import org.bukkit.entity.Cow;
import org.bukkit.scheduler.BukkitRunnable;

/**
 * Created by Tino on 16.06.2015.
 */
public class CowTask extends BukkitRunnable {
    private World world;
    private Cow c;

    public CowTask(World myworld, Cow myCow) {
        c = myCow;
        world = myworld;
    }

    public void run() {
        // check if cow on ground
            //create EXPLOSION
            // call cancel
        //else
            //set fire ticks to 20
            // set tje cows health to maximum


    }
}
