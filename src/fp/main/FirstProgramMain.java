/*package fp.main;

public class FirstProgramMain {

}*/

package fp.main;

//import java.util.logging.Handler;
//import fp.main.Handler;
import java.util.logging.Logger;

//import org.bukkit.Bukkit;
//import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
 
 
public class FirstProgramMain extends JavaPlugin {
    
    Logger log = Logger.getLogger("Minecraft");
    
    @Override
    public void onEnable() {
        //Bukkit.getPluginManager().registerEvents(new Handler(this), this);
        log.info("[ACM] Enabled!");
    }
    
    @Override
    public void onDisable() {
        log.info("[ACM] Disabled!");
    }
 
}