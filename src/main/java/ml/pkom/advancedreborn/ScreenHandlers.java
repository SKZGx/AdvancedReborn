package ml.pkom.advancedreborn;

import ml.pkom.advancedreborn.screen.CardboardBoxScreenHandler;
import ml.pkom.mcpitanlibarch.api.gui.ExtendedScreenHandlerTypeBuilder;
import net.minecraft.screen.ScreenHandlerType;

import static ml.pkom.advancedreborn.AdvancedReborn.registry;

public class ScreenHandlers {
    public static ScreenHandlerType<CardboardBoxScreenHandler> CARDBOARD_BOX_SCREEN_HANDLER = new ExtendedScreenHandlerTypeBuilder(CardboardBoxScreenHandler::new).build();

    public static void init() {
        registry.registerScreenHandlerType(AdvancedReborn.id("cardboard_box"), () -> CARDBOARD_BOX_SCREEN_HANDLER);
    }
}
