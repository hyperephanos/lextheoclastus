package in.khraos.lextheoclastus.Registeries;

import in.khraos.lextheoclastus.LexTheoclastus;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModRegisteries {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.createBlocks(LexTheoclastus.modid);

    public static final DeferredRegister<Block> BLOCKENTITIES =
            DeferredRegister.createBlocks(LexTheoclastus.modid);
}
