package ml.pkom.advancedreborn.items;

import dev.architectury.registry.fuel.FuelRegistry;
import ml.pkom.mcpitanlibarch.api.item.CompatibleItemSettings;
import ml.pkom.mcpitanlibarch.api.item.ExtendItem;

public class FuelCanItem extends ExtendItem {
    public FuelCanItem(CompatibleItemSettings settings) {
        super(settings);
        FuelRegistry.register(2000, this);
    }
}
