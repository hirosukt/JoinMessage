package hirosuke.smartjoinmessage

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerQuitEvent

class EventQuit : Listener {

    @EventHandler
    fun onPlayerJoin(e: PlayerQuitEvent) {
        e.quitMessage = e.player.name + " has left."
    }
}