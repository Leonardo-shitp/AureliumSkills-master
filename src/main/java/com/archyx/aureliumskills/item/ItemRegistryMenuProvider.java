package com.archyx.aureliumskills.item;

import com.archyx.slate.item.provider.KeyedItemProvider;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.Nullable;

public class ItemRegistryMenuProvider implements KeyedItemProvider {

    private final ItemRegistry itemRegistry;

    public ItemRegistryMenuProvider(ItemRegistry itemRegistry) {
        this.itemRegistry = itemRegistry;
    }

    @Override
    public @Nullable ItemStack getItem(String key) {
        return itemRegistry.getItem(key);
    }
}
