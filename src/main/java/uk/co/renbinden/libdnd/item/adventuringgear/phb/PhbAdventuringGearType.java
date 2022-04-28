package uk.co.renbinden.libdnd.item.adventuringgear.phb;

import uk.co.renbinden.libdnd.item.adventuringgear.*;
import uk.co.renbinden.libdnd.money.Money;
import uk.co.renbinden.libdnd.weight.Weight;

import static uk.co.renbinden.libdnd.money.Currency.*;
import static uk.co.renbinden.libdnd.weight.WeightUnit.LB;

public final class PhbAdventuringGearType {
    public static final AdventuringGearType ABACUS = new AdventuringGearType(
            "abacus",
            "Abacus",
            new Money(2, GP),
            new Weight(2, LB));
    public static final AdventuringGearType ACID_VIAL = new AdventuringGearType(
            "acid",
            "Acid (vial)",
            new Money(25, GP),
            new Weight(1, LB));
    public static final AdventuringGearType ALCHEMISTS_FIRE_FLASK = new AdventuringGearType(
            "alchemists_fire",
            "Alchemist's fire (flask)",
            new Money(50, GP),
            new Weight(1, LB));
    public static final AmmunitionType ARROW = new AmmunitionType(
            "arrow",
            "Arrow",
            new Money(5, CP),
            new Weight(0.05, LB)
    );
    public static final AmmunitionType BLOWGUN_NEEDLE = new AmmunitionType(
            "blowgun_needle",
            "Blowgun needle",
            new Money(2, CP),
            new Weight(0.02, LB)
    );
    public static final AmmunitionType CROSSBOW_BOLT = new AmmunitionType(
            "crossbow_bolt",
            "Crossbow bolt",
            new Money(5, CP),
            new Weight(0.075, LB)
    );
    public static final AmmunitionType SLING_BULLET = new AmmunitionType(
            "sling_bullet",
            "Sling bullet",
            new Money(1, CP),
            new Weight(0.075, LB)
    );
    public static final AdventuringGearType ANTITOXIN = new AdventuringGearType(
            "antitoxin",
            "Antitoxin (vial)",
            new Money(50, GP),
            new Weight(0, LB));
    public static final ArcaneFocusType CRYSTAL = new ArcaneFocusType(
            "crystal",
            "Crystal",
            new Money(10, GP),
            new Weight(1, LB)
    );
    public static final ArcaneFocusType ORB = new ArcaneFocusType(
            "orb",
            "Orb",
            new Money(20, GP),
            new Weight(3, LB)
    );
    public static final ArcaneFocusType ROD = new ArcaneFocusType(
            "rod",
            "Rod",
            new Money(10, GP),
            new Weight(2, LB)
    );
    public static final ArcaneFocusType STAFF = new ArcaneFocusType(
            "staff",
            "Staff",
            new Money(5, GP),
            new Weight(4, LB)
    );
    public static final ArcaneFocusType WAND = new ArcaneFocusType(
            "wand",
            "Wand",
            new Money(10, GP),
            new Weight(1, LB)
    );
    public static final AdventuringGearType BACKPACK = new AdventuringGearType(
            "backpack",
            "Backpack",
            new Money(2, GP),
            new Weight(5, LB));
    public static final AdventuringGearType BALL_BEARINGS = new AdventuringGearType(
            "ball_bearings",
            "Ball bearings (bag of 1000)",
            new Money(1, GP),
            new Weight(2, LB));
    public static final AdventuringGearType BARREL = new AdventuringGearType(
            "barrel",
            "Barrel",
            new Money(2, GP),
            new Weight(70, LB));
    public static final AdventuringGearType BASKET = new AdventuringGearType(
            "basket",
            "Basket",
            new Money(4, SP),
            new Weight(70, LB));
    public static final AdventuringGearType BEDROLL = new AdventuringGearType(
            "bedroll",
            "Bedroll",
            new Money(1, GP),
            new Weight(7, LB));
    public static final AdventuringGearType BELL = new AdventuringGearType(
            "bell",
            "Bell",
            new Money(1, GP),
            new Weight(0, LB));
    public static final AdventuringGearType BLANKET = new AdventuringGearType(
            "blanket",
            "Blanket",
            new Money(5, SP),
            new Weight(3, LB));
    public static final AdventuringGearType BLOCK_AND_TACKLE = new AdventuringGearType(
            "block_and_tackle",
            "Block and tackle",
            new Money(1, GP),
            new Weight(5, LB));
    public static final AdventuringGearType BOOK = new AdventuringGearType(
            "book",
            "Book",
            new Money(25, GP),
            new Weight(5, LB));
    public static final AdventuringGearType GLASS_BOTTLE = new AdventuringGearType(
            "glass_bottle",
            "Bottle, glass",
            new Money(2, GP),
            new Weight(2, LB));
    public static final AdventuringGearType BUCKET = new AdventuringGearType(
            "bucket",
            "Bucket",
            new Money(5, CP),
            new Weight(2, LB));
    public static final AdventuringGearType CALTROPS = new AdventuringGearType(
            "caltrops",
            "Caltrops (bag of 20)",
            new Money(1, GP),
            new Weight(2, LB));
    public static final AdventuringGearType CANDLE = new AdventuringGearType(
            "candle",
            "Candle",
            new Money(1, CP),
            new Weight(0, LB));
    public static final AdventuringGearType CROSSBOW_BOLT_CASE = new AdventuringGearType(
            "crossbow_bolt_case",
            "Case, crossbow bolt",
            new Money(1, GP),
            new Weight(1, LB));
    public static final AdventuringGearType MAP_OR_SCROLL_CASE = new AdventuringGearType(
            "map_or_scroll_case",
            "Case, map or scroll",
            new Money(1, GP),
            new Weight(1, LB));
    public static final AdventuringGearType CHAIN = new AdventuringGearType(
            "chain",
            "Chain (10 feet)",
            new Money(5, GP),
            new Weight(10, LB));
    public static final AdventuringGearType CHALK = new AdventuringGearType(
            "chalk",
            "Chalk (1 piece)",
            new Money(1, CP),
            new Weight(0, LB));
    public static final AdventuringGearType CHEST = new AdventuringGearType(
            "chest",
            "Chest",
            new Money(5, GP),
            new Weight(25, LB));
    public static final AdventuringGearType CLIMBERS_KIT = new AdventuringGearType(
            "climbers_kit",
            "Climber's kit",
            new Money(25, GP),
            new Weight(12, LB));
    public static final AdventuringGearType COMMON_CLOTHES = new AdventuringGearType(
            "common_clothes",
            "Clothes, common",
            new Money(5, SP),
            new Weight(3, LB));
    public static final AdventuringGearType COSTUME_CLOTHES = new AdventuringGearType(
            "costume_clothes",
            "Clothes, costume",
            new Money(5, GP),
            new Weight(4, LB));
    public static final AdventuringGearType FINE_CLOTHES = new AdventuringGearType(
            "fine_clothes",
            "Clothes, fine",
            new Money(15, GP),
            new Weight(6, LB));
    public static final AdventuringGearType TRAVELERS_CLOTHES = new AdventuringGearType(
            "travelers_clothes",
            "Clothes, traveler's",
            new Money(2, GP),
            new Weight(4, LB));
    public static final AdventuringGearType COMPONENT_POUCH = new AdventuringGearType(
            "component_pouch",
            "Component pouch",
            new Money(25, GP),
            new Weight(2, LB));
    public static final AdventuringGearType CROWBAR = new AdventuringGearType(
            "crowbar",
            "Crowbar",
            new Money(2, GP),
            new Weight(5, LB));
    public static final DruidicFocusType SPRIG_OF_MISTLETOE = new DruidicFocusType(
            "sprig_of_mistletoe",
            "Sprig of mistletoe",
            new Money(1, GP),
            new Weight(0, LB)
    );
    public static final DruidicFocusType TOTEM = new DruidicFocusType(
            "totem",
            "Totem",
            new Money(1, GP),
            new Weight(0, LB)
    );
    public static final DruidicFocusType WOODEN_STAFF = new DruidicFocusType(
            "wooden_staff",
            "Wooden staff",
            new Money(5, GP),
            new Weight(4, LB)
    );
    public static final DruidicFocusType YEW_WAND = new DruidicFocusType(
            "yew_wand",
            "Yew wand",
            new Money(10, GP),
            new Weight(1, LB)
    );
    public static final AdventuringGearType FISHING_TACKLE = new AdventuringGearType(
            "fishing_tackle",
            "Fishing tackle",
            new Money(1, GP),
            new Weight(4, LB));
    public static final AdventuringGearType FLASK_OR_TANKARD = new AdventuringGearType(
            "flask_or_tankard",
            "Flask or tankard",
            new Money(2, CP),
            new Weight(1, LB));
    public static final AdventuringGearType GRAPPLING_HOOK = new AdventuringGearType(
            "grappling_hook",
            "Grappling hook",
            new Money(2, GP),
            new Weight(4, LB));
    public static final AdventuringGearType HAMMER = new AdventuringGearType(
            "hammer",
            "Hammer",
            new Money(1, GP),
            new Weight(3, LB));
    public static final AdventuringGearType SLEDGE_HAMMER = new AdventuringGearType(
            "sledge_hammer",
            "Hammer, sledge",
            new Money(2, GP),
            new Weight(10, LB));
    public static final AdventuringGearType HEALERS_KIT = new AdventuringGearType(
            "healers_kit",
            "Healer's kit",
            new Money(5, GP),
            new Weight(3, LB));
    public static final HolySymbolType AMULET = new HolySymbolType(
            "amulet",
            "Amulet",
            new Money(5, GP),
            new Weight(1, LB)
    );
    public static final HolySymbolType EMBLEM = new HolySymbolType(
            "emblem",
            "Emblem",
            new Money(5, GP),
            new Weight(0, LB)
    );
    public static final HolySymbolType RELIQUARY = new HolySymbolType(
            "reliquary",
            "Reliquary",
            new Money(5, GP),
            new Weight(2, LB)
    );
    public static final AdventuringGearType HOLY_WATER = new AdventuringGearType(
            "holy_water",
            "Holy water (flask)",
            new Money(25, GP),
            new Weight(1, LB));
    public static final AdventuringGearType HOURGLASS = new AdventuringGearType(
            "hourglass",
            "Hourglass",
            new Money(25, GP),
            new Weight(1, LB));
    public static final AdventuringGearType HUNTING_TRAP = new AdventuringGearType(
            "hunting_trap",
            "Hunting trap",
            new Money(5, GP),
            new Weight(25, LB));
    public static final AdventuringGearType INK = new AdventuringGearType(
            "ink",
            "Ink (1 ounce bottle)",
            new Money(10, GP),
            new Weight(0, LB));
    public static final AdventuringGearType INK_PEN = new AdventuringGearType(
            "ink_pen",
            "Ink pen",
            new Money(2, CP),
            new Weight(0, LB));
    public static final AdventuringGearType JUG_OR_PITCHER = new AdventuringGearType(
            "jug_or_pitcher",
            "Jug or pitcher",
            new Money(2, CP),
            new Weight(4, LB));
    public static final AdventuringGearType LADDER = new AdventuringGearType(
            "ladder",
            "Ladder (10-foot)",
            new Money(1, SP),
            new Weight(25, LB));
    public static final AdventuringGearType LAMP = new AdventuringGearType(
            "lamp",
            "Lamp",
            new Money(5, SP),
            new Weight(1, LB));
    public static final AdventuringGearType BULLSEYE_LANTERN = new AdventuringGearType(
            "bullseye_lantern",
            "Lantern, bullseye",
            new Money(10, GP),
            new Weight(2, LB));
    public static final AdventuringGearType HOODED_LANTERN = new AdventuringGearType(
            "hooded_lantern",
            "Lantern, hooded",
            new Money(5, GP),
            new Weight(2, LB));
    public static final AdventuringGearType LOCK = new AdventuringGearType(
            "lock",
            "Lock",
            new Money(10, GP),
            new Weight(1, LB));
    public static final AdventuringGearType MAGNIFYING_GLASS = new AdventuringGearType(
            "magnifying_glass",
            "Magnifying glass",
            new Money(100, GP),
            new Weight(0, LB));
    public static final AdventuringGearType MANACLES = new AdventuringGearType(
            "manacles",
            "Manacles",
            new Money(2, GP),
            new Weight(6, LB));
    public static final AdventuringGearType MESS_KIT = new AdventuringGearType(
            "mess_kit",
            "Mess kit",
            new Money(2, SP),
            new Weight(1, LB));
    public static final AdventuringGearType STEEL_MIRROR = new AdventuringGearType(
            "steel_mirror",
            "Mirror, steel",
            new Money(5, GP),
            new Weight(0.5, LB));
    public static final AdventuringGearType OIL = new AdventuringGearType(
            "oil",
            "Oil (flask)",
            new Money(1, SP),
            new Weight(1, LB));
    public static final AdventuringGearType PAPER = new AdventuringGearType(
            "paper",
            "Paper (one sheet)",
            new Money(2, SP),
            new Weight(0, LB));
    public static final AdventuringGearType PARCHMENT = new AdventuringGearType(
            "parchment",
            "Parchment (one sheet)",
            new Money(1, SP),
            new Weight(0, LB));
    public static final AdventuringGearType PERFUME = new AdventuringGearType(
            "perfume",
            "Perfume (vial)",
            new Money(5, GP),
            new Weight(0, LB));
    public static final AdventuringGearType MINERS_PICK = new AdventuringGearType(
            "miners_pick",
            "Pick, miner's",
            new Money(2, GP),
            new Weight(10, LB));
    public static final AdventuringGearType PITON = new AdventuringGearType(
            "piton",
            "Piton",
            new Money(5, CP),
            new Weight(0.25, LB));
    public static final AdventuringGearType BASIC_POISON = new AdventuringGearType(
            "basic_poison",
            "Poison, basic (vial)",
            new Money(100, GP),
            new Weight(0, LB));
    public static final AdventuringGearType POLE = new AdventuringGearType(
            "pole",
            "Pole (10-foot)",
            new Money(5, CP),
            new Weight(7, LB));
    public static final AdventuringGearType IRON_POT = new AdventuringGearType(
            "iron_pot",
            "Iron pot",
            new Money(2, GP),
            new Weight(7, LB));
    public static final AdventuringGearType POTION_OF_HEALING = new AdventuringGearType(
            "potion_of_healing",
            "Potion of healing",
            new Money(50, GP),
            new Weight(0.5, LB));
    public static final AdventuringGearType POUCH = new AdventuringGearType(
            "pouch",
            "Pouch",
            new Money(5, SP),
            new Weight(1, LB));
    public static final AdventuringGearType QUIVER = new AdventuringGearType(
            "quiver",
            "Quiver",
            new Money(1, GP),
            new Weight(1, LB));
    public static final AdventuringGearType PORTABLE_RAM = new AdventuringGearType(
            "portable_ram",
            "Ram, portable",
            new Money(4, GP),
            new Weight(35, LB));
    public static final AdventuringGearType RATIONS = new AdventuringGearType(
            "rations",
            "Rations (1 day)",
            new Money(5, SP),
            new Weight(2, LB));
    public static final AdventuringGearType ROBES = new AdventuringGearType(
            "robes",
            "Robes",
            new Money(1, GP),
            new Weight(4, LB));
    public static final AdventuringGearType HEMPEN_ROPE = new AdventuringGearType(
            "hempen_rope",
            "Rope, hempen (50 feet)",
            new Money(1, GP),
            new Weight(10, LB));
    public static final AdventuringGearType SILK_ROPE = new AdventuringGearType(
            "silk_rope",
            "Rope, silk (50 feet)",
            new Money(10, GP),
            new Weight(5, LB));
    public static final AdventuringGearType SACK = new AdventuringGearType(
            "sack",
            "Sack",
            new Money(1, CP),
            new Weight(0.5, LB));
    public static final AdventuringGearType MERCHANTS_SCALE = new AdventuringGearType(
            "merchants_scale",
            "Scale, merchant's",
            new Money(5, GP),
            new Weight(3, LB));
    public static final AdventuringGearType SEALING_WAX = new AdventuringGearType(
            "sealing_wax",
            "Sealing wax",
            new Money(5, SP),
            new Weight(0, LB));
    public static final AdventuringGearType SHOVEL = new AdventuringGearType(
            "shovel",
            "Shovel",
            new Money(2, GP),
            new Weight(5, LB));
    public static final AdventuringGearType SIGNAL_WHISTLE = new AdventuringGearType(
            "signal_whistle",
            "Signal whistle",
            new Money(5, CP),
            new Weight(0, LB));
    public static final AdventuringGearType SIGNET_RING = new AdventuringGearType(
            "signet_ring",
            "Signet ring",
            new Money(5, GP),
            new Weight(0, LB));
    public static final AdventuringGearType SOAP = new AdventuringGearType(
            "soap",
            "Soap",
            new Money(2, CP),
            new Weight(0, LB));
    public static final AdventuringGearType SPELLBOOK = new AdventuringGearType(
            "spellbook",
            "Spellbook",
            new Money(50, GP),
            new Weight(3, LB));
    public static final AdventuringGearType IRON_SPIKES = new AdventuringGearType(
            "iron_spikes",
            "Spikes, iron (10)",
            new Money(1, GP),
            new Weight(5, LB));
    public static final AdventuringGearType SPYGLASS = new AdventuringGearType(
            "spyglass",
            "Spyglass",
            new Money(1000, GP),
            new Weight(1, LB));
    public static final AdventuringGearType TWO_PERSON_TENT = new AdventuringGearType(
            "two_person_tent",
            "Tent, two-person",
            new Money(2, GP),
            new Weight(20, LB));
    public static final AdventuringGearType TINDERBOX = new AdventuringGearType(
            "tinderbox",
            "Tinderbox",
            new Money(5, SP),
            new Weight(1, LB));
    public static final AdventuringGearType TORCH = new AdventuringGearType(
            "torch",
            "Torch",
            new Money(1, CP),
            new Weight(1, LB));
    public static final AdventuringGearType VIAL = new AdventuringGearType(
            "vial",
            "Vial",
            new Money(1, GP),
            new Weight(0, LB));
    public static final AdventuringGearType WATERSKIN = new AdventuringGearType(
            "waterskin",
            "Waterskin",
            new Money(2, SP),
            new Weight(5, LB));
    public static final AdventuringGearType WHETSTONE = new AdventuringGearType(
            "whetstone",
            "Whetstone",
            new Money(1, CP),
            new Weight(1, LB));

    private PhbAdventuringGearType() {}
}
