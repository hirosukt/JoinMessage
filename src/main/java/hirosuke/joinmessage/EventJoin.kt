package hirosuke.joinmessage

import org.bukkit.ChatColor
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

class EventJoin : Listener {

    @EventHandler
    fun onPlayerJoin(e: PlayerJoinEvent) {
        var joinmsg = JoinMessage.instance.config.getString("join").toString().replace("{player}", e.player.name).replace('&', '§')
        e.joinMessage = ChatColor.translateAlternateColorCodes('&', joinmsg)
    }
}