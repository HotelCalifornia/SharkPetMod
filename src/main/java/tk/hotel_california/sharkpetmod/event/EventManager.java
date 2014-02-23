package tk.hotel_california.sharkpetmod.event;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

import java.util.Random;

public class EventManager implements IWorldGenerator {
    public void generate(Random random, int chunkX, int chunkZ, World world,IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch(world.provider.dimensionId) {
            case 0: generateOverworld(world, random, chunkX * 16, chunkZ * 16);
        }
    }

    private void generateOverworld(World world, Random random, int x, int z) {

    }
}
