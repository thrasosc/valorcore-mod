package net.pixeldreamstudios.valorcore;

import net.fabricmc.api.ClientModInitializer;
import net.pixeldreamstudios.valorcore.util.ClientStuff;

public class ValorCoreClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ClientStuff.createGuideBookButton();
        ClientStuff.showWelcomeScren();
    }
}
