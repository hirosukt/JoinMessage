package hirosuke.joinmessage

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

class CommandConfig : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (command.name == "setjoinmsg") {
            if(args.isEmpty()) {
                return false
            }
            val builder = StringBuilder()
            for (element in args) {
                builder.append("$element ")
            }

            JoinMessage.instance.config.set("join", builder)
            sender.sendMessage("Join message set to \"$builder\".")

        } else if (command.name == "setquitmsg") {
            if(args.isEmpty()) {
                return false
            }
            val builder = StringBuilder()
            for (element in args) {
                builder.append("$element ")
            }

            JoinMessage.instance.config.set("quit", builder)
            sender.sendMessage("Quit message set to \"$builder\".")
        }
        return true
    }
}