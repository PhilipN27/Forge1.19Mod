package net.philip.mod119.item;

import net.minecraftforge.eventbus.api.IEventBus;
import net.philip.mod119.ModPn;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModPn.MOD_ID);

    public static void register (IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
