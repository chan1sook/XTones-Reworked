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

public class ZkulBlocks {

  private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(
    ForgeRegistries.BLOCKS,
    XtonesReworkedMod.MOD_ID
  );

  public static final RegistryObject<Block> ZKUL_BLOCK_0 = registerBlock(
    "zkul_block_0",
    () ->
      new Block(
        AbstractBlock.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );

  public static final RegistryObject<Block> ZKUL_BLOCK_1 = registerBlock(
    "zkul_block_1",
    () ->
      new Block(
        AbstractBlock.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> ZKUL_BLOCK_2 = registerBlock(
    "zkul_block_2",
    () ->
      new Block(
        AbstractBlock.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> ZKUL_BLOCK_3 = registerBlock(
    "zkul_block_3",
    () ->
      new Block(
        AbstractBlock.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> ZKUL_BLOCK_4 = registerBlock(
    "zkul_block_4",
    () ->
      new Block(
        AbstractBlock.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> ZKUL_BLOCK_5 = registerBlock(
    "zkul_block_5",
    () ->
      new Block(
        AbstractBlock.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> ZKUL_BLOCK_6 = registerBlock(
    "zkul_block_6",
    () ->
      new Block(
        AbstractBlock.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );

  public static final RegistryObject<Block> ZKUL_BLOCK_7 = registerBlock(
    "zkul_block_7",
    () ->
      new Block(
        AbstractBlock.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> ZKUL_BLOCK_8 = registerBlock(
    "zkul_block_8",
    () ->
      new Block(
        AbstractBlock.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> ZKUL_BLOCK_9 = registerBlock(
    "zkul_block_9",
    () ->
      new Block(
        AbstractBlock.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> ZKUL_BLOCK_10 = registerBlock(
    "zkul_block_10",
    () ->
      new Block(
        AbstractBlock.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> ZKUL_BLOCK_11 = registerBlock(
    "zkul_block_11",
    () ->
      new Block(
        AbstractBlock.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> ZKUL_BLOCK_12 = registerBlock(
    "zkul_block_12",
    () ->
      new Block(
        AbstractBlock.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> ZKUL_BLOCK_13 = registerBlock(
    "zkul_block_13",
    () ->
      new Block(
        AbstractBlock.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> ZKUL_BLOCK_14 = registerBlock(
    "zkul_block_14",
    () ->
      new Block(
        AbstractBlock.Properties
          .of(Material.STONE)
          .strength(6f)
          .requiresCorrectToolForDrops()
      )
    
  );
  public static final RegistryObject<Block> ZKUL_BLOCK_15 = registerBlock(
    "zkul_block_15",
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
