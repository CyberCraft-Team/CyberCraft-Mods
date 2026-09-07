# CyberCraft Mods

CyberCraft Minecraft NeoForge modlari.

## Modlar

### CC Ores

Yangi rudalar va bloklar qo'shuvchi mod — o'z ichiga oladi:

- Yangi ruda bloklari va teksturalar
- Crafting retseptlar
- O'yin dunyosida generatsiya (worldgen)
- Advancements

### cybercraftranks

Minecraft server uchun rank tizimi modi.

> `cybercraftauth` olib tashlandi. "Faqat CyberCraft Launcher orqali kirish"
> qoidasi endi backend tomonida ta'minlanadi: yggdrasil'da parol bilan kirish
> yopilgan (`YGGDRASIL_ALLOW_PASSWORD_LOGIN=False`), ya'ni token faqat
> launcher orqali beriladi. Eski kod git tarixida qoldi.

## Texnologiyalar

- Java 21
- NeoForge / Minecraft 1.21.x
- Gradle

## Build

Har bir mod papkasida:

```bash
./gradlew build
```

Build natijasi `build/libs/` papkasida .jar fayl sifatida paydo bo'ladi.
