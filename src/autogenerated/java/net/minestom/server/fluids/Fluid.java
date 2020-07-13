//==============================
//  AUTOGENERATED BY EnumGenerator
//==============================
package net.minestom.server.fluids;
import net.minestom.server.registry.Registries;
import net.minestom.server.utils.NamespaceID;
@SuppressWarnings({"deprecation"})

public enum Fluid {
	EMPTY("minecraft:empty"),
	FLOWING_WATER("minecraft:flowing_water"),
	WATER("minecraft:water"),
	FLOWING_LAVA("minecraft:flowing_lava"),
	LAVA("minecraft:lava"),
;
	private String namespaceID;

	Fluid(String namespaceID) {
		this.namespaceID = namespaceID;
		Registries.fluids.put(NamespaceID.from(namespaceID), this);
	}

	public int getId() {
		return ordinal();
	}

	public String getNamespaceID() {
		return namespaceID;
	}

	public static Fluid fromId(int id) {
		if(id >= 0 && id < values().length) {
			return values()[id];
		}
		return EMPTY;
	}
}