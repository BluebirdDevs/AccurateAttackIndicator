package bluebird.acc.client;

import net.minecraft.client.MinecraftClient;
import net.fabricmc.api.ClientModInitializer;

public class AccClient implements ClientModInitializer {

    private static final MinecraftClient client = MinecraftClient.getInstance();

    @Override
    public void onInitializeClient() {
    }
}
