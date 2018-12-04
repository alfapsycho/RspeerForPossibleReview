package Backups;

import java.util.Arrays;
import java.util.List;

public class Speedtest {

    static String testItem = "Regen bracelet";
    static List<String> loots = Arrays.asList("Shark","Tuna potato","Anglerfish", "Dark crab", "Sea turtle", "Cooked karambwan","Manta ray", "Pineapple pizza", "Mushroom potato",
            "Amethyst arrow", "Dragon arrow", "Onyx bolts (e)", "Dragonstone bolts (e)", "Dragonstone dragon bolts (e)", "Diamond dragon bolts (e)", "Amethyst broad bolts",
            "Abyssal whip", "Abyssal dagger", "Scythe of vitur (uncharged)", "Ghrazi rapier", "Elder maul", "Saradomin sword", "Armadyl godsword", "Bandos godsword", "Saradomin godsword", "Zamorak godsword",
            "3rd age longsword", "Granite maul", "Tzhaar-ket-om", "Dragon crossbow", "Dragon thrownaxe", "Dragon javelin", "Dragon dart", "Dragon dart(p++)", "Dragon dart(p+)", "Dragon dart(p)",
            "Dragon 2h sword", "Dragon claws", "Dragon scimitar", "Dragon sword", "Dragon dagger(p++)", "Mystic hat (dark)", "Mystic hat (light)",
            "Dharok's platelegs 0", "Dharok's platebody 0", "Dharok's helm 0", "Dharok's greataxe 0", "Ahrim's robetop 0", "Ahrim's robeskirt 0", "Ahrim's hood 0", "Ahrim's staff 0",
            "Torag's platelegs 0", "Torag's platebody 0", "Torag's helm 0", "Guthan's warspear 0", "Guthan's platebody 0", "Guthan's helm 0", "Guthan's chainskirt 0",
            "Verac's plateskirt 0", "Verac's helm 0", "Verac's flail 0", "Verac's brassard 0", "Mystic robe bottom (dark)", "Mystic robe bottom (light)", "Mystic robe top", "Mystic mud staff",
            "Mystic robe bottom", "Mystic robe top (dark)", "Mystic robe top (light)", "Mystic smoke staff", "Infinity boots", "Infinity bottoms", "Infinity gloves", "Infinity hat", "Infinity top",
            "Elysian spirit shield", "Arcane spirit shield", "Ancestral robe top", "Kodai wand", "Ancestral robe bottom", "3rd age platebody", "3rd age platelegs", "Spectral spirit shield",
            "Dragon full helm", "Dragon warhammer", "Armadyl chestplate", "Ranger boots", "Pegasian boots", "Armadyl chainskirt", "Armadyl crossbow", "3rd age range top", "Bandos tassets",
            "Abyssal bludgeon", "Primordial boots", "Dragon platebody", "Bandos chestplate", "Ancestral hat", "Necklace of anguish", "Amulet of torture", "Ring of suffering", "Tormented bracelet",
            "Rangers' tunic", "Dragon crossbow", "Super combat potion(4)", "Super combat potion(3)", "Super combat potion(2)", "Super combat potion(1)", "Super restore(4)", "Super restore(3)",
            "Super restore(2)", "Super restore(1)", "Saradomin brew(4)", "Saradomin brew(3)", "Saradomin brew(2)", "Saradomin brew(1)", "Death rune", "Ancient staff", "Toxic staff (uncharged)",
            "Staff of the dead", "Staff of light", "Ranging potion(4)", "Ranging potion(3)", "Super strength(4)", "Super strength(3)", "Super strength(2)", "Super strength(1)",
            "Amulet of glory", "Amulet of glory(4)", "Helm of neitiznot", "Berserker helm", "Berserker ring", "Seers' ring", "Archers' ring", "Warrior ring","Magic shortbow",
            "Obsidian cape", "Obsidian helm", "Obsidian platebody", "Obsidian platelegs", "Toktz-ket-xil", "Black d'hide body", "Amulet of fury", "Black d'hide chaps", "Black d'hide vamb",
            "Rune Platebody", "Karil's leathertop 0", "Karil's leatherskirt 0", "Karil's crossbow 0", "Elder chaos hood", "Elder chaos robe", "Elder chaos top", "Rune plateskirt", "Gilded plateskirt",
            "Rune platelegs", "Gilded platelegs", "Gilded boots", "Rune knife", "Rune knife(p++)", "Rune knife(p+)", "Rune knife(p)", "Rune dart(p++)", "Rune dart(p+)", "Rune dart(p)", "Rune dart",
            "Prayer potion(4)", "Prayer potion(3)", "Prayer potion(2)", "Prayer potion(1)", "Ring of recoil", "Bastion potion(4)", "Bastion potion(3)", "Bastion potion(2)","Bastion potion(1)",
            "Rune crossbow","Monkfish","Dark bow", "Heavy ballista", "Light ballista", "Amulet of strength", "Dragon boots", "Tome of fire (empty)", "Burnt page", "Wizard boots", "Regen bracelet");


    public static void main(String[] args) {
        testSpeed();
    }


    public static void testSpeed(){
        long startTimer = System.nanoTime();
        testSearch();
        long endTimer = System.nanoTime();
        long timeTaken = endTimer-startTimer;
        System.out.println("Time taken with contains: " + timeTaken);

        startTimer = System.nanoTime();
        testSearchFor();
        endTimer = System.nanoTime();
        timeTaken = endTimer-startTimer;
        System.out.println("Time taken with Loop: " + timeTaken);

        startTimer = System.nanoTime();
        streamAnyMatch();
        endTimer = System.nanoTime();
        timeTaken = endTimer-startTimer;
        System.out.println("Time taken with Stream: " + timeTaken);
    }

    public static boolean testSearch(){
        return loots.contains(testItem);
    }

    public static boolean testSearchFor(){
        for(String s : loots){
            if (s.equals(testItem)){
                return true;
            }
        }
        return false;
    }

    public static boolean streamAnyMatch(){
        return loots.stream().parallel().anyMatch(item -> item.equals(testItem));
    }

}
