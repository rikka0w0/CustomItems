package me.otho.customItems.data;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

import me.otho.customItems.CustomItems;

public class ResourcePaths {
	public final static String generated = CustomItems.MOD_ID + "_generated";
	public final static Path respack_src = Paths.get("resourcepacks", CustomItems.MOD_ID + "_resources");
	public final static Path respack_generated = Paths.get("resourcepacks", generated);
	public final static Path datapacks = Paths.get("datapacks");
	public final static Path datapack_generated = Paths.get("datapacks", generated);
	
	public final static Path respack_src_textures = Paths.get(respack_src.toString(), "assets", CustomItems.MOD_ID, "textures");
	public final static Path respack_src_block = Paths.get(respack_src_textures.toString(), "block");
	public final static Path respack_src_item = Paths.get(respack_src_textures.toString(), "item");
	public final static Path respack_src_armor = Paths.get(respack_src_textures.toString(), "models", "armor");
	
	/**
	 * Create pack.mcmeta in a specific path without overwriting existing pack.meta
	 * @param path
	 * @param description the text shown in pack.mcmeta
	 */
	public static void pack_mcmeta(Path path, String description) {
		String format = "5";
		File metaFile = Paths.get(path.toString(), "pack.mcmeta").toFile();
		if (!metaFile.exists()) {
			try {
				FileWriter fileWriter = new FileWriter(metaFile);
				PrintWriter writer = new PrintWriter(fileWriter);
				writer.println("{");
				writer.println("\t\"pack\": {");
				writer.println("\t\t\"description\": \"" + description + "\",");
				writer.println("\t\t\"pack_format\": " + format);
				writer.println("\t}");
				writer.println("}");
				writer.flush();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void createEmptyFolders(Path path) {
		if (!path.toFile().exists()) {
			path.toFile().mkdirs();
		}
	}
}
