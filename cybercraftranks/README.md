# CyberCraft Ranks Mod

Bu mod o'yinchilarning ranklarini TAB menyusida ko'rsatadi.

## Setup

1. **NeoForge Generator'dan base fayllarni oling:**
   - https://neoforged.net/mod-generator/
   - Minecraft: 1.21.1
   - NeoForge: 21.1.215
   - Mod ID: `cybercraftranks`
   - Package: `uz.cybercraft.ranks`
2. **Generatsiya qilingan fayllarni shu papkaga joylashtiring:**
   - `build.gradle`
   - `settings.gradle`
   - `gradle.properties`
   - `gradlew`, `gradlew.bat`
   - `gradle/` papkasi
   - `src/` papkasi

3. **Keyin menga ayting** va men Java kodlarni yozib beraman:
   - `CyberCraftRanksMod.java` - Asosiy mod
   - `RankManager.java` - Rank ma'lumotlarini boshqarish
   - `TabListHandler.java` - TAB menyusini o'zgartirish

## Rank Format

TAB menyusida ko'rinadigan format:

```
§7[Player]§f Username
§a[VIP]§f Username
§b[MVP]§f Username
§d[Elite]§f Username
§6[Legend]§f Username
```

## API Endpoint

Mod quyidagi API dan rank oladi:

```
GET /api/rewards/player-rank/?username=PlayerName
```

Response:

```json
{
  "username": "PlayerName",
  "rank": "Player",
  "color_code": "§7",
  "formatted": "§7[Player]§f PlayerName"
}
```
