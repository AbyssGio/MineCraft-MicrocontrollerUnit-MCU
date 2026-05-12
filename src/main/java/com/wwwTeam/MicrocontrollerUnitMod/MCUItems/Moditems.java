package com.wwwTeam.MicrocontrollerUnitMod.MCUItems;

import com.wwwTeam.MicrocontrollerUnitMod.MicrocontrollerUnit;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

// MOD ITEM REGISTER
public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MicrocontrollerUnit.MODID);

    public static final RegistryObject<Item> ICE_ETHER =
            ITEMS.register("ice_ether", () -> new Item(new Item.Properties()));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
