package hirosuke.smartjoinmessage;

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.plugin.PluginManager
import org.bukkit.plugin.java.JavaPlugin


class SmartJoinMessage : JavaPlugin(), Listener {

    override fun onEnable() {
        val pm: PluginManager = server.pluginManager
        pm.registerEvents(EventJoin(), this)
        pm.registerEvents(EventQuit(), this)

        logger.info("plugin has loaded.")
    }

    override fun onDisable() {
        logger.info("plugin has unloaded.")
    }
}
