package fp.main;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;
 
 
public class FirstProgramMain extends JavaPlugin {
    
    Logger log = Logger.getLogger("Minecraft");
    
    @Override
    public void onEnable() {
        log.info("[ACM] Enabled!");
    }
    
    @Override
    public void onDisable() {
        log.info("[ACM] Disabled!");
    }
 
}