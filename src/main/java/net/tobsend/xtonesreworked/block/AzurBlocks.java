package net.tobsend.xtonesreworked.block;

import java.util.function.Supplier;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.tobsend.xtonesreworked.XtonesReworkedMod;
import net.tobsend.xtonesreworked.item.ModCreativeModeTab;
import net.tobsend.xtonesreworked.item.ModItems;

public class AzurBlocks {

  private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(
    ForgeRegistries.BLOCKS,
    XtonesReworkedMod.MOD_ID
  );

  public static final RegistryObject<Block> AZUR_BLOCK_0 = registerBlock(
    "azur_block_0",
    () ->
      new Block(
        AbstractBlock.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );

  public static final RegistryObject<Block> AZUR_BLOCK_1 = registerBlock(
    "azur_block_1",
    () ->
      new Block(
        AbstractBlock.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final RegistryObject<Block> AZUR_BLOCK_2 = registerBlock(
    "azur_block_2",
    () ->
      new Block(
        AbstractBlock.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final RegistryObject<Block> AZUR_BLOCK_3 = registerBlock(
    "azur_block_3",
    () ->
      new Block(
        AbstractBlock.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final RegistryObject<Block> AZUR_BLOCK_4 = registerBlock(
    "azur_block_4",
    () ->
      new Block(
        AbstractBlock.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final RegistryObject<Block> AZUR_BLOCK_5 = registerBlock(
    "azur_block_5",
    () ->
      new Block(
        AbstractBlock.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final RegistryObject<Block> AZUR_BLOCK_6 = registerBlock(
    "azur_block_6",
    () ->
      new Block(
        AbstractBlock.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );

  public static final RegistryObject<Block> AZUR_BLOCK_7 = registerBlock(
    "azur_block_7",
    () ->
      new Block(
        AbstractBlock.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final RegistryObject<Block> AZUR_BLOCK_8 = registerBlock(
    "azur_block_8",
    () ->
      new Block(
        AbstractBlock.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final RegistryObject<Block> AZUR_BLOCK_9 = registerBlock(
    "azur_block_9",
    () ->
      new Block(
        AbstractBlock.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final RegistryObject<Block> AZUR_BLOCK_10 = registerBlock(
    "azur_block_10",
    () ->
      new Block(
        AbstractBlock.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final RegistryObject<Block> AZUR_BLOCK_11 = registerBlock(
    "azur_block_11",
    () ->
      new Block(
        AbstractBlock.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
  );
  public static final RegistryObject<Block> AZUR_BLOCK_12 = registerBlock(
    "azur_block_12",
    () ->
      new Block(
        AbstractBlock.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> AZUR_BLOCK_13 = registerBlock(
    "azur_block_13",
    () ->
      new Block(
        AbstractBlock.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> AZUR_BLOCK_14 = registerBlock(
    "azur_block_14",
    () ->
      new Block(
        AbstractBlock.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> AZUR_BLOCK_15 = registerBlock(
    "azur_block_15",
    () ->
      new Block(
        AbstractBlock.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );

  private static <T extends Block> RegistryObject<T> registerBlock(
    String name,
    Supplier<T> block
  ) {
    RegistryObject<T> toReturn = BLOCKS.register(name, block);
    registerBlockItem(name, toReturn);
    return toReturn;
  }

  private static <T extends Block> RegistryObject<Item> registerBlockItem(
    String name,
    RegistryObject<T> block
  ) {
    return ModItems.ITEMS.register(
      name,
      () -> new BlockItem(block.get(), new Item.Properties().tab(ModCreativeModeTab.XTONE_REWORK_TAB))
    );
  }

  public static void register(IEventBus eventBus) {
    BLOCKS.register(eventBus);
  }
}
