package net.tobsend.xtonesreworked.block;

import java.util.function.Supplier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.ForgeRegistries;
import net.neoforged.neoforge.registries.RegistryObject;
import net.tobsend.xtonesreworked.XtonesReworkedMod;
import net.tobsend.xtonesreworked.block.custom.XBlock;
import net.tobsend.xtonesreworked.item.ModItems;

public class ZestBlocks {

  private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(
    ForgeRegistries.BLOCKS,
    XtonesReworkedMod.MODID
  );

  public static final RegistryObject<Block> ZEST_BLOCK_0 = registerBlock(
    "zest_block_0",
    XBlock::new
  );

  public static final RegistryObject<Block> ZEST_BLOCK_1 = registerBlock(
    "zest_block_1",
    XBlock::new
  );
  public static final RegistryObject<Block> ZEST_BLOCK_2 = registerBlock(
    "zest_block_2",
    XBlock::new
  );
  public static final RegistryObject<Block> ZEST_BLOCK_3 = registerBlock(
    "zest_block_3",
    XBlock::new
  );
  public static final RegistryObject<Block> ZEST_BLOCK_4 = registerBlock(
    "zest_block_4",
    XBlock::new
  );
  public static final RegistryObject<Block> ZEST_BLOCK_5 = registerBlock(
    "zest_block_5",
    XBlock::new
  );
  public static final RegistryObject<Block> ZEST_BLOCK_6 = registerBlock(
    "zest_block_6",
    XBlock::new
  );

  public static final RegistryObject<Block> ZEST_BLOCK_7 = registerBlock(
    "zest_block_7",
    XBlock::new
  );
  public static final RegistryObject<Block> ZEST_BLOCK_8 = registerBlock(
    "zest_block_8",
    XBlock::new
  );
  public static final RegistryObject<Block> ZEST_BLOCK_9 = registerBlock(
    "zest_block_9",
    XBlock::new
  );
  public static final RegistryObject<Block> ZEST_BLOCK_10 = registerBlock(
    "zest_block_10",
    XBlock::new
  );
  public static final RegistryObject<Block> ZEST_BLOCK_11 = registerBlock(
    "zest_block_11",
    XBlock::new
  );
  public static final RegistryObject<Block> ZEST_BLOCK_12 = registerBlock(
    "zest_block_12",
    XBlock::new
  );
  public static final RegistryObject<Block> ZEST_BLOCK_13 = registerBlock(
    "zest_block_13",
    XBlock::new
  );
  public static final RegistryObject<Block> ZEST_BLOCK_14 = registerBlock(
    "zest_block_14",
    XBlock::new
  );
  public static final RegistryObject<Block> ZEST_BLOCK_15 = registerBlock(
    "zest_block_15",
    XBlock::new
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
      () -> new BlockItem(block.get(), new Item.Properties())
    );
  }

  public static void register(IEventBus eventBus) {
    BLOCKS.register(eventBus);
  }
}
