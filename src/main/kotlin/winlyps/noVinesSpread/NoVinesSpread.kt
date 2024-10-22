package winlyps.noVinesSpread

import org.bukkit.plugin.java.JavaPlugin

class NoVinesSpread : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("doVinesSpread", "false")
        }
        logger.info("NoVinesSpread plugin has been enabled.")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        logger.info("NoVinesSpread plugin has been disabled.")
    }
}