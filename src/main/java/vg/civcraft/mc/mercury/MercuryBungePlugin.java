package vg.civcraft.mc.mercury;

import java.util.logging.Logger;
import net.md_5.bungee.api.plugin.Plugin;

public class MercuryBungePlugin extends Plugin {

	public static MercuryBungePlugin plugin;

	public static Logger log() {
		return MercuryBungePlugin.plugin.getLogger();
	}

	@Override
	public void onEnable() {
		plugin = this;
		MercuryAPI.initialize();
		MercuryAPI.addChannels("mercury");
		MercuryBungeeListener l = new MercuryBungeeListener();
		MercuryAPI.registerListener(l, "mercury");
	}
}
