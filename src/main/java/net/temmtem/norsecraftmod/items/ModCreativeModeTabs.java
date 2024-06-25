package net.temmtem.norsecraftmod.items;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.temmtem.norsecraftmod.NorseCraftMod;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NorseCraftMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> NORSECRAFT_TAB = CREATIVE_MODE_TABS.register("norsecraft_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.HOLYWATER.get()))
                    .title(Component.translatable("creativetab.norsecraft_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.HOLYWATER.get());
                        output.accept(ModItems.CYCLOPSEYE.get());


                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
