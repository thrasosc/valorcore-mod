package net.pixeldreamstudios.valorcore;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.pixeldreamstudios.valorcore.util.ClientStuff;

@Environment(EnvType.CLIENT)
public class ValorCoreClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ClientStuff.createGuideBookButton();
//        ClientStuff.showWelcomeScren();
    }
}
