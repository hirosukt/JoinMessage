package hirosuke.joinmessage

import org.bukkit.ChatColor
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerQuitEvent

class EventQuit : Listener {

    @EventHandler
    fun onPlayerJoin(e: PlayerQuitEvent) {
        var quitmsg = JoinMessage.instance.config.getString("quit").toString().replace("{player}", e.player.name).replace('&', '§')
        e.quitMessage = ChatColor.translateAlternateColorCodes('&', quitmsg)
    }
}