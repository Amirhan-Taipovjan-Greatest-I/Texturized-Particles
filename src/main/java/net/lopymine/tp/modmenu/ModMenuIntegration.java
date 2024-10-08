package net.lopymine.tp.modmenu;

import com.terraformersmc.modmenu.api.*;

import net.fabricmc.loader.api.FabricLoader;

import net.lopymine.tp.modmenu.yacl.YACLConfigurationScreen;

public class ModMenuIntegration implements ModMenuApi {

	@Override
	public ConfigScreenFactory<?> getModConfigScreenFactory() {
		if (FabricLoader.getInstance().isModLoaded("yet_another_config_lib_v3")) {
			return YACLConfigurationScreen::createScreen;
		}
		return NoConfigLibraryScreen::createScreen;
	}
}