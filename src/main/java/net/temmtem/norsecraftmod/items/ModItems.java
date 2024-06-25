package net.temmtem.norsecraftmod.items;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.temmtem.norsecraftmod.NorseCraftMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NorseCraftMod.MOD_ID);

    public static final RegistryObject<Item> HOLYWATER = ITEMS.register("holywater",
            () -> new Item(new Item.Properties()));
public static final RegistryObject<Item> CYCLOPSEYE = ITEMS.register("cyclopseye",
        () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
