package hirosuke.joinmessage;

import org.bukkit.event.Listener
import org.bukkit.plugin.Plugin
import org.bukkit.plugin.PluginManager
import org.bukkit.plugin.java.JavaPlugin


class JoinMessage : JavaPlugin(), Listener {

    companion object {
        lateinit var instance: Plugin
            private set
    }

    override fun onEnable() {
        instance = this
        config.addDefault("join", "{player} has joined.")
        config.addDefault("quit", "{player} has left.")
        config.options().copyDefaults(true)
        saveConfig()

        val pm: PluginManager = server.pluginManager
        pm.registerEvents(EventJoin(), this)
        pm.registerEvents(EventQuit(), this)

        getCommand("setjoinmsg").executor = CommandConfig()
        getCommand("setquitmsg").executor = CommandConfig()
        logger.info("plugin has loaded.")
    }

    override fun onDisable() {
        logger.info("plugin has unloaded.")
    }
}
