package in.khraos.lextheoclastus;

import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;

@Mod(LexTheoclastus.modid)
public class LexTheoclastus {
    public static final String modid = "lextheoclastus";
    public static final Logger LOGGER = LogUtils.getLogger();

    public LexTheoclastus(IEventBus modEventBus, ModContainer modContainer) {
        
        // ModBlocks.BLOCKS.register(modEventBus);
        // ModBlocks.BLOCKENTITIES.register(modEventBus);
    }
}