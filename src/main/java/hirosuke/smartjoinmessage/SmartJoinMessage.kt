package hirosuke.smartjoinmessage;

import org.bukkit.plugin.java.JavaPlugin;

class SmartJoinMessage : JavaPlugin() {

    override fun onEnable() {
        logger.info("plugin has loaded.")
    }

    override fun onDisable() {
        logger.info("plugin has unloaded.")
    }
}
