package uk.co.renbinden.libdnd.item.tool.phb;

import uk.co.renbinden.libdnd.ability.StrengthRequirement;
import uk.co.renbinden.libdnd.armorclass.ArmorClassCalculation;
import uk.co.renbinden.libdnd.armorclass.ArmorClassCalculation.AbilityModifierArmorClassComponent;
import uk.co.renbinden.libdnd.armorclass.ArmorClassCalculation.BaseArmorClassComponent;
import uk.co.renbinden.libdnd.armorclass.ArmorClassCalculation.CappedAbilityModifierArmorClassComponent;
import uk.co.renbinden.libdnd.distance.Distance;
import uk.co.renbinden.libdnd.item.tool.*;
import uk.co.renbinden.libdnd.item.tool.vehicle.MountType;
import uk.co.renbinden.libdnd.item.tool.vehicle.SaddleType;
import uk.co.renbinden.libdnd.item.tool.vehicle.WaterborneVehicleType;
import uk.co.renbinden.libdnd.money.Money;
import uk.co.renbinden.libdnd.weight.Weight;

import static uk.co.renbinden.libdnd.ability.Ability.DEXTERITY;
import static uk.co.renbinden.libdnd.distance.DistanceUnit.FEET;
import static uk.co.renbinden.libdnd.distance.DistanceUnit.MILES;
import static uk.co.renbinden.libdnd.money.Currency.*;
import static uk.co.renbinden.libdnd.weight.WeightUnit.LB;

public final class PhbToolType {
    public static final ArtisansToolsType ALCHEMISTS_SUPPLIES = new ArtisansToolsType(
            "alchemists_supplies",
            "Alchemist's supplies",
            new Money(50, GP),
            new Weight(8, LB)
    );
    public static final ArtisansToolsType BREWERS_SUPPLIES = new ArtisansToolsType(
            "brewers_supplies",
            "Brewer's supplies",
            new Money(20, GP),
            new Weight(9, LB)
    );
    public static final ArtisansToolsType CALLIGRAPHERS_SUPPLIES = new ArtisansToolsType(
            "calligraphers_supplies",
            "Calligrapher's supplies",
            new Money(10, GP),
            new Weight(5, LB)
    );
    public static final ArtisansToolsType CARPENTERS_TOOLS = new ArtisansToolsType(
            "carpenters_tools",
            "Carpenter's tools",
            new Money(8, GP),
            new Weight(6, LB)
    );
    public static final ArtisansToolsType CARTOGRAPHERS_TOOLS = new ArtisansToolsType(
            "cartographers_tools",
            "Cartographer's tools",
            new Money(15, GP),
            new Weight(6, LB)
    );
    public static final ArtisansToolsType COBBLERS_TOOLS = new ArtisansToolsType(
            "cobblers_tools",
            "Cobbler's tools",
            new Money(5, GP),
            new Weight(5, LB)
    );
    public static final ArtisansToolsType COOKS_UTENSILS = new ArtisansToolsType(
            "cooks_utensils",
            "Cook's utensils",
            new Money(1, GP),
            new Weight(8, LB)
    );
    public static final ArtisansToolsType GLASSBLOWERS_TOOLS = new ArtisansToolsType(
            "glassblowers_tools",
            "Glassblower's tools",
            new Money(30, GP),
            new Weight(5, LB)
    );
    public static final ArtisansToolsType JEWELERS_TOOLS = new ArtisansToolsType(
            "jewelers_tools",
            "Jeweler's tools",
            new Money(25, GP),
            new Weight(2, LB)
    );
    public static final ArtisansToolsType LEATHERWORKERS_TOOLS = new ArtisansToolsType(
            "leatherworkers_tools",
            "Leatherworker's tools",
            new Money(5, GP),
            new Weight(5, LB)
    );
    public static final ArtisansToolsType MASONS_TOOLS = new ArtisansToolsType(
            "masons_tools",
            "Mason's tools",
            new Money(10, GP),
            new Weight(8, LB)
    );
    public static final ArtisansToolsType PAINTERS_SUPPLIES = new ArtisansToolsType(
            "painters_supplies",
            "Painter's supplies",
            new Money(10, GP),
            new Weight(5, LB)
    );
    public static final ArtisansToolsType POTTERS_TOOLS = new ArtisansToolsType(
            "potters_tools",
            "Potter's tools",
            new Money(10, GP),
            new Weight(3, LB)
    );
    public static final ArtisansToolsType SMITHS_TOOLS = new ArtisansToolsType(
            "smiths_tools",
            "Smith's tools",
            new Money(20, GP),
            new Weight(8, LB)
    );
    public static final ArtisansToolsType TINKERS_TOOLS = new ArtisansToolsType(
            "tinkers_tools",
            "Tinker's tools",
            new Money(50, GP),
            new Weight(10, LB)
    );
    public static final ArtisansToolsType WEAVERS_TOOLS = new ArtisansToolsType(
            "weavers_tools",
            "Weaver's tools",
            new Money(1, GP),
            new Weight(5, LB)
    );
    public static final ArtisansToolsType WOODCARVERS_TOOLS = new ArtisansToolsType(
            "woodcarvers_tools",
            "Woodcarver's tools",
            new Money(1, GP),
            new Weight(5, LB)
    );
    public static final ToolType DISGUISE_KIT = new ToolType(
            "disguise_kit",
            "Disguise kit",
            new Money(25, GP),
            new Weight(3, LB)
    );
    public static final ToolType FORGERY_KIT = new ToolType(
            "forgery_kit",
            "Forgery kit",
            new Money(15, GP),
            new Weight(5, LB)
    );
    public static final ToolType DICE_SET = new GamingSetType(
            "dice_set",
            "Dice set",
            new Money(1, SP),
            new Weight(0, LB)
    );
    public static final ToolType DRAGONCHESS_SET = new GamingSetType(
            "dragonchess_set",
            "Dragonchess set",
            new Money(1, GP),
            new Weight(0.5, LB)
    );
    public static final ToolType PLAYING_CARD_SET = new GamingSetType(
            "playing_card_set",
            "Playing card set",
            new Money(5, SP),
            new Weight(0, LB)
    );
    public static final ToolType THREE_DRAGON_ANTE_SET = new GamingSetType(
            "three_dragon_ante_set",
            "Three-Dragon Ante set",
            new Money(1, GP),
            new Weight(0, LB)
    );
    public static final ToolType HERBALISM_KIT = new ToolType(
            "herbalism_kit",
            "Herbalism kit",
            new Money(5, GP),
            new Weight(3, LB)
    );
    public static final MusicalInstrumentType BAGPIPES = new MusicalInstrumentType(
            "bagpipes",
            "Bagpipes",
            new Money(30, GP),
            new Weight(6, LB)
    );
    public static final MusicalInstrumentType DRUM = new MusicalInstrumentType(
            "drum",
            "Drum",
            new Money(6, GP),
            new Weight(3, LB)
    );
    public static final MusicalInstrumentType DULCIMER = new MusicalInstrumentType(
            "dulcimer",
            "Dulcimer",
            new Money(25, GP),
            new Weight(10, LB)
    );
    public static final MusicalInstrumentType FLUTE = new MusicalInstrumentType(
            "flute",
            "Flute",
            new Money(2, GP),
            new Weight(1, LB)
    );
    public static final MusicalInstrumentType LUTE = new MusicalInstrumentType(
            "lute",
            "Lute",
            new Money(35, GP),
            new Weight(2, LB)
    );
    public static final MusicalInstrumentType LYRE = new MusicalInstrumentType(
            "lyre",
            "Lyre",
            new Money(30, GP),
            new Weight(2, LB)
    );
    public static final MusicalInstrumentType HORN = new MusicalInstrumentType(
            "horn",
            "Horn",
            new Money(3, GP),
            new Weight(2, LB)
    );
    public static final MusicalInstrumentType PAN_FLUTE = new MusicalInstrumentType(
            "pan_flute",
            "Pan flute",
            new Money(12, GP),
            new Weight(2, LB)
    );
    public static final MusicalInstrumentType SHAWM = new MusicalInstrumentType(
            "shawm",
            "Shawm",
            new Money(2, GP),
            new Weight(1, LB)
    );
    public static final MusicalInstrumentType VIOL = new MusicalInstrumentType(
            "viol",
            "Viol",
            new Money(30, GP),
            new Weight(1, LB)
    );
    public static final ToolType NAVIGATORS_TOOLS = new ToolType(
            "navigators_tools",
            "Navigator's tools",
            new Money(25, GP),
            new Weight(2, LB)
    );
    public static final ToolType POISONERS_TOOLS = new ToolType(
            "poisoners_tools",
            "Poisoner's kit",
            new Money(50, GP),
            new Weight(2, LB)
    );
    public static final ToolType THIEVES_TOOLS = new ToolType(
            "thieves_tools",
            "Thieves' tools",
            new Money(25, GP),
            new Weight(1, LB)
    );
    public static final MountType CAMEL = new MountType(
            "camel",
            "Camel",
            new Money(50, GP),
            new Distance(50, FEET),
            new Weight(480, LB)
    );
    public static final MountType DONKEY = new MountType(
            "donkey",
            "Donkey",
            new Money(8, GP),
            new Distance(40, FEET),
            new Weight(420, LB)
    );
    public static final MountType MULE = new MountType(
            "mule",
            "Mule",
            new Money(8, GP),
            new Distance(40, FEET),
            new Weight(420, LB)
    );
    public static final MountType ELEPHANT = new MountType(
            "elephant",
            "Elephant",
            new Money(200, GP),
            new Distance(40, FEET),
            new Weight(1320, LB)
    );
    public static final MountType DRAFT_HORSE = new MountType(
            "draft_horse",
            "Horse, draft",
            new Money(50, GP),
            new Distance(40, FEET),
            new Weight(540, LB)
    );
    public static final MountType RIDING_HORSE = new MountType(
            "riding_horse",
            "Horse, riding",
            new Money(75, GP),
            new Distance(60, FEET),
            new Weight(480, LB)
    );
    public static final MountType MASTIFF = new MountType(
            "mastiff",
            "Mastiff",
            new Money(25, GP),
            new Distance(40, FEET),
            new Weight(195, LB)
    );
    public static final MountType PONY = new MountType(
            "pony",
            "Pony",
            new Money(30, GP),
            new Distance(40, FEET),
            new Weight(225, LB)
    );
    public static final MountType WARHORSE = new MountType(
            "warhorse",
            "Warhorse",
            new Money(400, GP),
            new Distance(60, FEET),
            new Weight(540, LB)
    );
    public static final LightBardingType PADDED_BARDING = new LightBardingType(
            "padded_barding",
            "Barding, padded",
            new Money(20, GP),
            new Weight(16, LB),
            new ArmorClassCalculation(
                    new BaseArmorClassComponent(11),
                    new AbilityModifierArmorClassComponent(DEXTERITY)
            ),
            true,
            new StrengthRequirement(0),
            false
    );
    public static final LightBardingType LEATHER_BARDING = new LightBardingType(
            "leather_barding",
            "Barding, leather",
            new Money(40, GP),
            new Weight(20, LB),
            new ArmorClassCalculation(
                    new BaseArmorClassComponent(11),
                    new AbilityModifierArmorClassComponent(DEXTERITY)
            ),
            false,
            new StrengthRequirement(0),
            false
    );
    public static final LightBardingType STUDDED_LEATHER_BARDING = new LightBardingType(
            "studded_leather_barding",
            "Barding, studded leather",
            new Money(180, GP),
            new Weight(26, LB),
            new ArmorClassCalculation(
                    new BaseArmorClassComponent(12),
                    new AbilityModifierArmorClassComponent(DEXTERITY)
            ),
            false,
            new StrengthRequirement(0),
            false
    );
    public static final MediumBardingType HIDE_BARDING = new MediumBardingType(
            "hide_barding",
            "Barding, hide",
            new Money(40, GP),
            new Weight(24, LB),
            new ArmorClassCalculation(
                    new BaseArmorClassComponent(12),
                    new CappedAbilityModifierArmorClassComponent(DEXTERITY, 2)
            ),
            false,
            new StrengthRequirement(0),
            false
    );
    public static final MediumBardingType CHAIN_SHIRT_BARDING = new MediumBardingType(
            "chain_shirt_barding",
            "Barding, chain shirt",
            new Money(200, GP),
            new Weight(40, LB),
            new ArmorClassCalculation(
                    new BaseArmorClassComponent(13),
                    new CappedAbilityModifierArmorClassComponent(DEXTERITY, 2)
            ),
            false,
            new StrengthRequirement(0),
            true
    );
    public static final MediumBardingType SCALE_MAIL_BARDING = new MediumBardingType(
            "scale_mail_barding",
            "Barding, scale mail",
            new Money(200, GP),
            new Weight(90, LB),
            new ArmorClassCalculation(
                    new BaseArmorClassComponent(14),
                    new CappedAbilityModifierArmorClassComponent(DEXTERITY, 2)
            ),
            true,
            new StrengthRequirement(0),
            true
    );
    public static final MediumBardingType BREASTPLATE_BARDING = new MediumBardingType(
            "breastplate_barding",
            "Barding, breastplate",
            new Money(1600, GP),
            new Weight(40, LB),
            new ArmorClassCalculation(
                    new BaseArmorClassComponent(14),
                    new CappedAbilityModifierArmorClassComponent(DEXTERITY, 2)
            ),
            false,
            new StrengthRequirement(0),
            true
    );
    public static final MediumBardingType HALF_PLATE_BARDING = new MediumBardingType(
            "half_plate_barding",
            "Barding, half plate",
            new Money(3000, GP),
            new Weight(80, LB),
            new ArmorClassCalculation(
                    new BaseArmorClassComponent(15),
                    new CappedAbilityModifierArmorClassComponent(DEXTERITY, 2)
            ),
            true,
            new StrengthRequirement(0),
            true
    );
    public static final HeavyBardingType RING_MAIL_BARDING = new HeavyBardingType(
            "ring_mail_barding",
            "Barding, ring mail",
            new Money(120, GP),
            new Weight(80, LB),
            new ArmorClassCalculation(
                    new BaseArmorClassComponent(14)
            ),
            true,
            new StrengthRequirement(0),
            true
    );
    public static final HeavyBardingType CHAIN_MAIL_BARDING = new HeavyBardingType(
            "chain_mail_barding",
            "Barding, chain mail",
            new Money(300, GP),
            new Weight(110, LB),
            new ArmorClassCalculation(
                    new BaseArmorClassComponent(16)
            ),
            true,
            new StrengthRequirement(13),
            true
    );
    public static final HeavyBardingType SPLINT_BARDING = new HeavyBardingType(
            "splint_barding",
            "Barding, splint",
            new Money(800, GP),
            new Weight(120, LB),
            new ArmorClassCalculation(
                    new BaseArmorClassComponent(17)
            ),
            true,
            new StrengthRequirement(15),
            true
    );
    public static final HeavyBardingType PLATE_BARDING = new HeavyBardingType(
            "plate_barding",
            "Barding, plate",
            new Money(6000, GP),
            new Weight(130, LB),
            new ArmorClassCalculation(
                    new BaseArmorClassComponent(18)
            ),
            true,
            new StrengthRequirement(15),
            true
    );
    public static final ToolType BIT_AND_BRIDLE = new ToolType(
            "bit_and_bridle",
            "Bit and bridle",
            new Money(2, GP),
            new Weight(1, LB)
    );
    public static final ToolType CARRIAGE = new ToolType(
            "carriage",
            "Carriage",
            new Money(100, GP),
            new Weight(600, LB)
    );
    public static final ToolType CART = new ToolType(
            "cart",
            "Cart",
            new Money(15, GP),
            new Weight(200, LB)
    );
    public static final ToolType CHARIOT = new ToolType(
            "chariot",
            "Chariot",
            new Money(250, GP),
            new Weight(100, LB)
    );
    public static final ToolType FEED = new ToolType(
            "feed",
            "Feed (per day)",
            new Money(5, CP),
            new Weight(10, LB)
    );
    public static final SaddleType EXOTIC_SADDLE = new SaddleType(
            "exotic_saddle",
            "Saddle, exotic",
            new Money(60, GP),
            new Weight(40, LB)
    );
    public static final SaddleType MILITARY_SADDLE = new SaddleType(
            "military_saddle",
            "Saddle, military",
            new Money(20, GP),
            new Weight(30, LB)
    );
    public static final SaddleType PACK_SADDLE = new SaddleType(
            "pack_saddle",
            "Saddle, pack",
            new Money(5, GP),
            new Weight(15, LB)
    );
    public static final SaddleType RIDING_SADDLE = new SaddleType(
            "riding_saddle",
            "Saddle, riding",
            new Money(10, GP),
            new Weight(25, LB)
    );
    public static final ToolType SADDLEBAGS = new ToolType(
            "saddlebags",
            "Saddlebags",
            new Money(4, GP),
            new Weight(8, LB)
    );
    public static final ToolType SLED = new ToolType(
            "sled",
            "Sled",
            new Money(20, GP),
            new Weight(300, LB)
    );
    public static final ToolType STABLING = new ToolType(
            "stabling",
            "Stabling (per day)",
            new Money(5, SP),
            new Weight(0, LB)
    );
    public static final ToolType WAGON = new ToolType(
            "wagon",
            "Wagon",
            new Money(35, GP),
            new Weight(400, LB)
    );
    // While other vehicles measure speed in feet per turn (where a turn is 6 seconds), waterborne vehicles measure it
    // in mph. Their speed is included as miles here, for the sake of inclusion and simplicity of model, since it is
    // unlikely to be compared to movement of an animal or creature directly.
    public static final WaterborneVehicleType GALLEY = new WaterborneVehicleType(
            "galley",
            "Galley",
            new Money(30000, GP),
            new Distance(4, MILES)
    );
    public static final WaterborneVehicleType KEELBOAT = new WaterborneVehicleType(
            "keelboat",
            "Keelboat",
            new Money(3000, GP),
            new Distance(1, MILES)
    );
    public static final WaterborneVehicleType LONGSHIP = new WaterborneVehicleType(
            "longship",
            "Longship",
            new Money(10000, GP),
            new Distance(3, MILES)
    );
    public static final WaterborneVehicleType ROWBOAT = new WaterborneVehicleType(
            "rowboat",
            "Rowboat",
            new Money(50, GP),
            new Distance(1.5, MILES)
    );
    public static final WaterborneVehicleType SAILING_SHIP = new WaterborneVehicleType(
            "sailing_ship",
            "Sailing ship",
            new Money(10000, GP),
            new Distance(2, MILES)
    );
    public static final WaterborneVehicleType WARSHIP = new WaterborneVehicleType(
            "warship",
            "Warship",
            new Money(25000, GP),
            new Distance(2.5, MILES)
    );

    private PhbToolType() {}
}
