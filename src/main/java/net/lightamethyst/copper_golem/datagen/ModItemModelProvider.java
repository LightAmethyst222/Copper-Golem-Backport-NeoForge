package net.lightamethyst.copper_golem.datagen;

import net.lightamethyst.copper_golem.Copper_Golem;
import net.lightamethyst.copper_golem.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Copper_Golem.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.COPPER_NUGGET.get());
    }
}
