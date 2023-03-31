package ml.pkom.advancedreborn;

import ml.pkom.advancedreborn.armormaterials.BBArmorMaterial;
import ml.pkom.advancedreborn.armormaterials.NanoArmorMaterial;
import ml.pkom.advancedreborn.items.*;
import ml.pkom.mcpitanlibarch.api.item.CompatibleItemSettings;
import ml.pkom.mcpitanlibarch.api.item.ExtendItem;
import ml.pkom.mcpitanlibarch.api.util.ItemUtil;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import reborncore.common.powerSystem.RcEnergyTier;
import techreborn.config.TechRebornConfig;

import static ml.pkom.advancedreborn.AdvancedReborn.registry;

public class Items {
    public static CompatibleItemSettings nothingSettings = CompatibleItemSettings.of();

    public static Item CHARGE_PAD_MK_1 = ItemUtil.ofBlock(Blocks.CHARGE_PAD_MK_1, CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("charge_pad")).maxCount(64));
    public static Item CHARGE_PAD_MK_2 = ItemUtil.ofBlock(Blocks.CHARGE_PAD_MK_2, CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("charge_pad_2")).maxCount(64));
    public static Item CHARGE_PAD_MK_3 = ItemUtil.ofBlock(Blocks.CHARGE_PAD_MK_3, CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("charge_pad_3")).maxCount(64));
    public static Item CHARGE_PAD_MK_4 = ItemUtil.ofBlock(Blocks.CHARGE_PAD_MK_4, CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("charge_pad_4")).maxCount(64));
    public static Item CHARGE_PAD_MK_FINAL = ItemUtil.ofBlock(Blocks.CHARGE_PAD_MK_FINAL, CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("charge_pad_final")).maxCount(64));

    public static Item RAY_SOLAR_1 = ItemUtil.ofBlock(Blocks.RAY_SOLAR_1, CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("ray_solar_panel")).maxCount(64));
    public static Item RAY_SOLAR_2 = ItemUtil.ofBlock(Blocks.RAY_SOLAR_2, CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("ray_solar_panel_2")).maxCount(64));
    public static Item RAY_SOLAR_3 = ItemUtil.ofBlock(Blocks.RAY_SOLAR_3, CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("ray_solar_panel_3")).maxCount(64));
    public static Item RAY_SOLAR_4 = ItemUtil.ofBlock(Blocks.RAY_SOLAR_4, CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("ray_solar_panel_4")).maxCount(64));
    public static Item RAY_GENERATOR_1 = ItemUtil.ofBlock(Blocks.RAY_GENERATOR_1, CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("ray_generator")).maxCount(64));
    public static Item RAY_GENERATOR_2 = ItemUtil.ofBlock(Blocks.RAY_GENERATOR_2, CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("ray_generator_2")).maxCount(64));
    public static Item RAY_GENERATOR_3 = ItemUtil.ofBlock(Blocks.RAY_GENERATOR_3, CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("ray_generator_3")).maxCount(64));
    public static Item RAY_GENERATOR_4 = ItemUtil.ofBlock(Blocks.RAY_GENERATOR_4, CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("ray_generator_4")).maxCount(64));
    public static Item RAY_GENERATOR_5 = ItemUtil.ofBlock(Blocks.RAY_GENERATOR_5, CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("ray_generator_5")).maxCount(64));
    public static Item RAY_GENERATOR_6 = ItemUtil.ofBlock(Blocks.RAY_GENERATOR_6, CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("ray_generator_6")).maxCount(64));
    public static Item RAY_GENERATOR_7 = ItemUtil.ofBlock(Blocks.RAY_GENERATOR_7, CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("ray_generator_7")).maxCount(64));
    public static Item RAY_GENERATOR_8 = ItemUtil.ofBlock(Blocks.RAY_GENERATOR_8, CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("ray_generator_8")).maxCount(64));
    public static Item RAY_GENERATOR_9 = ItemUtil.ofBlock(Blocks.RAY_GENERATOR_9, CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("ray_generator_9")).maxCount(64));
    public static Item RAY_GENERATOR_10 = ItemUtil.ofBlock(Blocks.RAY_GENERATOR_10, CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("ray_generator_10")).maxCount(64));

    public static Item INDUCTION_FURNACE = ItemUtil.ofBlock(Blocks.INDUCTION_FURNACE, CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("induction_furnace")).maxCount(64));
    public static Item ROTARY_GRINDER = ItemUtil.ofBlock(Blocks.ROTARY_GRINDER, CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("rotary_grinder")).maxCount(64));
    public static Item CENTRIFUGAL_EXTRACTOR = ItemUtil.ofBlock(Blocks.CENTRIFUGAL_EXTRACTOR, CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("centrifugal_extractor")).maxCount(64));
    public static Item SINGULARITY_COMPRESSOR = ItemUtil.ofBlock(Blocks.SINGULARITY_COMPRESSOR, CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("singularity_compressor")).maxCount(64));
    public static Item CANNING_MACHINE = ItemUtil.ofBlock(Blocks.CANNING_MACHINE, CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("canning_machine")).maxCount(64));
    public static Item RENAMING_MACHINE = ItemUtil.ofBlock(Blocks.RENAMING_MACHINE, CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("renaming_machine")).maxCount(64));
    public static Item TELEPORTER = ItemUtil.ofBlock(Blocks.TELEPORTER, CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("teleporter")).maxCount(64));
    public static Item FARMING_MACHINE = ItemUtil.ofBlock(Blocks.FARMING_MACHINE, CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("farming_machine")).maxCount(64));
    public static Item LOGGING_MACHINE = ItemUtil.ofBlock(Blocks.LOGGING_MACHINE, CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("logging_machine")).maxCount(64));
    public static Item FERTILIZER_SPREADER = ItemUtil.ofBlock(Blocks.FERTILIZER_SPREADER, CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("fertilizer_spreader")).maxCount(64));
    public static Item ENCHANTMENT_EXTRACTOR = ItemUtil.ofBlock(Blocks.ENCHANTMENT_EXTRACTOR, CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("enchantment_extractor")).maxCount(64));

    public static Item FREQ_TRANS = new FreqTrans(CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("freq_trans")).maxCount(1).maxDamage(-1));
    public static Item CONFIG_WRENCH = new ConfigWrench(CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("config_wrench")).maxCount(1).maxDamage(-1));
    public static Item FORGE_HAMMER;
    public static Item ADVANCED_FORGE_HAMMER;

    static {
        // 実装しないでおく
        FORGE_HAMMER = new ForgeHammer(nothingSettings.recipeRemainder(FORGE_HAMMER), 80);
        ADVANCED_FORGE_HAMMER = new ForgeHammer(nothingSettings.recipeRemainder(ADVANCED_FORGE_HAMMER), 360);
    }

    public static Item NANO_SUIT_HELMET = new NanoSuitItem(NanoArmorMaterial.NANO, EquipmentSlot.HEAD, CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("nano_helmet")).maxCount(1).maxDamage(-1));
    public static Item NANO_SUIT_BODY_ARMOR = new NanoSuitItem(NanoArmorMaterial.NANO, EquipmentSlot.CHEST, CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("nano_chestplate")).maxCount(1).maxDamage(-1));
    public static Item NANO_SUIT_LEGGINGS = new NanoSuitItem(NanoArmorMaterial.NANO, EquipmentSlot.LEGS, CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("nano_leggings")).maxCount(1).maxDamage(-1));
    public static Item NANO_SUIT_BOOTS = new NanoSuitItem(NanoArmorMaterial.NANO, EquipmentSlot.FEET, CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("nano_boots")).maxCount(1).maxDamage(-1));

    // 強化バッテリー
    public static Item ADVANCED_BATTERY = new AdvancedBattery(CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("advanced_battery")).maxCount(1).maxDamage(-1), 8 * TechRebornConfig.redCellBatteryMaxCharge, RcEnergyTier.HIGH);
    public static Item ADVANCED_BATTERY_2 = new AdvancedBattery(CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("advanced_battery_2")).maxCount(1).maxDamage(-1), 64 * TechRebornConfig.redCellBatteryMaxCharge, RcEnergyTier.HIGH);
    public static Item ADVANCED_BATTERY_3 = new AdvancedBattery(CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("advanced_battery_3")).maxCount(1).maxDamage(-1), 512 * TechRebornConfig.redCellBatteryMaxCharge, RcEnergyTier.HIGH);
    public static Item ADVANCED_BATTERY_4 = new AdvancedBattery(CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("advanced_battery_4")).maxCount(1).maxDamage(-1), 4096 * TechRebornConfig.redCellBatteryMaxCharge, RcEnergyTier.HIGH);
    public static Item ADVANCED_BATTERY_5 = new AdvancedBattery(CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("advanced_battery_5")).maxCount(1).maxDamage(-1), 32768 * TechRebornConfig.redCellBatteryMaxCharge, RcEnergyTier.EXTREME);

    // ダイナマイト (予定: 時限爆弾)
    public static Item DYNAMITE = new Dynamite(CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("dynamite")).maxCount(64));
    public static Item STICKY_DYNAMITE = new Dynamite(CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("sticky_dynamite")).maxCount(64),true);
    public static Item INDUSTRIAL_DYNAMITE = new Dynamite(CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("industrial_dynamite")).maxCount(64),false, true);
    public static Item INDUSTRIAL_STICKY_DYNAMITE = new Dynamite(CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("industrial_sticky_dynamite")).maxCount(64),true, true);
    public static Item INDUSTRIAL_TNT = ItemUtil.ofBlock(Blocks.INDUSTRIAL_TNT, CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("industrial_tnt")).maxCount(64));

    // ライト、足場(鉄) 強化石材  ネーミングマシン
    public static Item LIGHT = ItemUtil.ofBlock(Blocks.LIGHT, CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("light")).maxCount(64));

    public static Item CARDBOARD_BOX = ItemUtil.ofBlock(Blocks.CARDBOARD_BOX, CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("cardboard_box")).maxCount(64));
    public static Item CARDBOARD_BOX_MINETARO = ItemUtil.ofBlock(Blocks.CARDBOARD_BOX_MINETARO, CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("cardboard_box_minetaro")).maxCount(64));
    public static Item CARDBOARD_BOX_MINEZON = ItemUtil.ofBlock(Blocks.CARDBOARD_BOX_MINEZON, CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("cardboard_box_minezon")).maxCount(64));
    public static Item CARDBOARD_BOX_NOTHING = ItemUtil.ofBlock(Blocks.CARDBOARD_BOX_NOTHING, CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("cardboard_box_nothing_logo")).maxCount(64));

    // 缶
    public static Item EMPTY_CAN = new ExtendItem(CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("empty_can")).maxCount(64));
    public static Item FUEL_CAN = new FuelCanItem(CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("fuel_can")).maxCount(64).recipeRemainder(EMPTY_CAN));
    public static Item FOOD_CAN = new FoodCanItem(CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("food_can")).maxCount(64).recipeRemainder(EMPTY_CAN).food(new FoodComponent.Builder().snack().hunger(2).saturationModifier(2).build()));

    // Better Batpack
    public static Item BATPACK_4 = new BetterBatpackItem(TechRebornConfig.lithiumBatpackCharge * 4, new BBArmorMaterial("batpack4"), RcEnergyTier.MEDIUM);
    public static Item BATPACK_16 = new BetterBatpackItem(TechRebornConfig.lithiumBatpackCharge * 16, new BBArmorMaterial("batpack16"), RcEnergyTier.HIGH);
    public static Item BATPACK_64 = new BetterBatpackItem(TechRebornConfig.lithiumBatpackCharge * 64, new BBArmorMaterial("batpack64"), RcEnergyTier.EXTREME);
    public static Item BATPACK_128 = new BetterBatpackItem(TechRebornConfig.lithiumBatpackCharge * 128, new BBArmorMaterial("batpack128"), RcEnergyTier.INSANE);



    // 素材アイテム
    public static Item DUCT_TAPE = new ExtendItem(CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("duct_tape")).maxCount(64));
    public static Item CARDBOARD_SHEET = new ExtendItem(CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("cardboard_sheet")).maxCount(64));

    //public static Item ADD_ITEMS = new AddItems(CompatibleItemSettings.of().addGroup(AdvancedReborn.AR_GROUP, AdvancedReborn.id("z_add_items")).maxCount(64));

    public static void init() {
        registry.registerItem(AdvancedReborn.id("charge_pad"), () -> CHARGE_PAD_MK_1);
        registry.registerItem(AdvancedReborn.id("charge_pad_2"), () -> CHARGE_PAD_MK_2);
        registry.registerItem(AdvancedReborn.id("charge_pad_3"), () -> CHARGE_PAD_MK_3);
        registry.registerItem(AdvancedReborn.id("charge_pad_4"), () -> CHARGE_PAD_MK_4);
        registry.registerItem(AdvancedReborn.id("charge_pad_final"), () -> CHARGE_PAD_MK_FINAL);

        registry.registerItem(AdvancedReborn.id("ray_solar_panel"), () -> RAY_SOLAR_1);
        registry.registerItem(AdvancedReborn.id("ray_solar_panel_2"), () -> RAY_SOLAR_2);
        registry.registerItem(AdvancedReborn.id("ray_solar_panel_3"), () -> RAY_SOLAR_3);
        registry.registerItem(AdvancedReborn.id("ray_solar_panel_4"), () -> RAY_SOLAR_4);
        registry.registerItem(AdvancedReborn.id("ray_generator"), () -> RAY_GENERATOR_1);
        registry.registerItem(AdvancedReborn.id("ray_generator_2"), () -> RAY_GENERATOR_2);
        registry.registerItem(AdvancedReborn.id("ray_generator_3"), () -> RAY_GENERATOR_3);
        registry.registerItem(AdvancedReborn.id("ray_generator_4"), () -> RAY_GENERATOR_4);
        registry.registerItem(AdvancedReborn.id("ray_generator_5"), () -> RAY_GENERATOR_5);
        registry.registerItem(AdvancedReborn.id("ray_generator_6"), () -> RAY_GENERATOR_6);
        registry.registerItem(AdvancedReborn.id("ray_generator_7"), () -> RAY_GENERATOR_7);
        registry.registerItem(AdvancedReborn.id("ray_generator_8"), () -> RAY_GENERATOR_8);
        registry.registerItem(AdvancedReborn.id("ray_generator_9"), () -> RAY_GENERATOR_9);
        registry.registerItem(AdvancedReborn.id("ray_generator_10"), () -> RAY_GENERATOR_10);

        registry.registerItem(AdvancedReborn.id("induction_furnace"), () -> INDUCTION_FURNACE);
        registry.registerItem(AdvancedReborn.id("rotary_grinder"), () -> ROTARY_GRINDER);
        registry.registerItem(AdvancedReborn.id("centrifugal_extractor"), () -> CENTRIFUGAL_EXTRACTOR);
        registry.registerItem(AdvancedReborn.id("singularity_compressor"), () -> SINGULARITY_COMPRESSOR);
        registry.registerItem(AdvancedReborn.id("canning_machine"), () -> CANNING_MACHINE);
        registry.registerItem(AdvancedReborn.id("renaming_machine"), () -> RENAMING_MACHINE);
        registry.registerItem(AdvancedReborn.id("teleporter"), () -> TELEPORTER);
        registry.registerItem(AdvancedReborn.id("farming_machine"), () -> FARMING_MACHINE);
        registry.registerItem(AdvancedReborn.id("logging_machine"), () -> LOGGING_MACHINE);
        registry.registerItem(AdvancedReborn.id("fertilizer_spreader"), () -> FERTILIZER_SPREADER);
        registry.registerItem(AdvancedReborn.id("enchantment_extractor"), () -> ENCHANTMENT_EXTRACTOR);

        registry.registerItem(AdvancedReborn.id("freq_trans"), () -> FREQ_TRANS);
        registry.registerItem(AdvancedReborn.id("config_wrench"), () -> CONFIG_WRENCH);
        registry.registerItem(AdvancedReborn.id("forge_hammer"), () -> FORGE_HAMMER);
        registry.registerItem(AdvancedReborn.id("advanced_forge_hammer"), () -> ADVANCED_FORGE_HAMMER);
        registry.registerItem(AdvancedReborn.id("dynamite"), () -> DYNAMITE);
        registry.registerItem(AdvancedReborn.id("sticky_dynamite"), () -> STICKY_DYNAMITE);
        registry.registerItem(AdvancedReborn.id("industrial_dynamite"), () -> INDUSTRIAL_DYNAMITE);
        registry.registerItem(AdvancedReborn.id("industrial_sticky_dynamite"), () -> INDUSTRIAL_STICKY_DYNAMITE);
        registry.registerItem(AdvancedReborn.id("industrial_tnt"), () -> INDUSTRIAL_TNT);
        registry.registerItem(AdvancedReborn.id("light"), () -> LIGHT);
        registry.registerItem(AdvancedReborn.id("cardboard_box"), () -> CARDBOARD_BOX);
        registry.registerItem(AdvancedReborn.id("cardboard_box_minetaro"), () -> CARDBOARD_BOX_MINETARO);
        registry.registerItem(AdvancedReborn.id("cardboard_box_minezon"), () -> CARDBOARD_BOX_MINEZON);
        registry.registerItem(AdvancedReborn.id("cardboard_box_nothing_logo"), () -> CARDBOARD_BOX_NOTHING);

        registry.registerItem(AdvancedReborn.id("advanced_battery"), () -> ADVANCED_BATTERY);
        registry.registerItem(AdvancedReborn.id("advanced_battery_2"), () -> ADVANCED_BATTERY_2);
        registry.registerItem(AdvancedReborn.id("advanced_battery_3"), () -> ADVANCED_BATTERY_3);
        registry.registerItem(AdvancedReborn.id("advanced_battery_4"), () -> ADVANCED_BATTERY_4);
        registry.registerItem(AdvancedReborn.id("advanced_battery_5"), () -> ADVANCED_BATTERY_5);

        registry.registerItem(AdvancedReborn.id("nano_helmet"), () -> NANO_SUIT_HELMET);
        registry.registerItem(AdvancedReborn.id("nano_chestplate"), () -> NANO_SUIT_BODY_ARMOR);
        registry.registerItem(AdvancedReborn.id("nano_leggings"), () -> NANO_SUIT_LEGGINGS);
        registry.registerItem(AdvancedReborn.id("nano_boots"), () -> NANO_SUIT_BOOTS);

        registry.registerItem(AdvancedReborn.id("empty_can"), () -> EMPTY_CAN);
        registry.registerItem(AdvancedReborn.id("fuel_can"), () -> FUEL_CAN);
        registry.registerItem(AdvancedReborn.id("food_can"), () -> FOOD_CAN);
        registry.registerItem(AdvancedReborn.id("cardboard_sheet"), () -> CARDBOARD_SHEET);
        registry.registerItem(AdvancedReborn.id("duct_tape"), () -> DUCT_TAPE);

        registry.registerItem(new Identifier("better_batpack:batpack4"), () -> BATPACK_4);
        registry.registerItem(new Identifier("better_batpack:batpack16"), () -> BATPACK_16);
        registry.registerItem(new Identifier("better_batpack:batpack64"), () -> BATPACK_64);
        registry.registerItem(new Identifier("better_batpack:batpack128"), () -> BATPACK_128);

        //registry.registerItem(AdvancedReborn.id("z_add_items"), () -> ADD_ITEMS);
    }
}
