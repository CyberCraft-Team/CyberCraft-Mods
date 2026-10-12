# CyberCraft Ranks

Minecraft 1.21.1 uchun NeoForge modi. Java 21 talab qilinadi.
Kompilyatsiya NeoForge 21.1.229 bilan bajariladi; metadata minimal
21.1.215 versiyasini qabul qiladi. Haqiqiy moslikni o'yinda tekshiring.

## Build

```sh
./gradlew build
```

Natija: `build/libs/cybercraftranks-1.0.0.jar`. Versiya
`gradle.properties` faylidagi `mod_version` orqali belgilanadi.

## Server sozlamalari

JAR faylini NeoForge serverining `mods/` papkasiga joylashtiring.
Ranklar backenddan faqat server tomonidan olinadi. Server JVM argumentlari:

```text
-Dcybercraft.api=https://api.cybercraft.uz
-Dcybercraft.key=<backend MOD_API_KEY qiymati>
```

`cybercraft.api` backendning asosiy manzili; `/api/v1` qo'shmang.
JVM `-D` argumentlarini server ishga tushirish buyrug'ida `-jar` dan oldin
bering. CyberCraft Backend boshqaradigan serverlarga bu qiymatlarni panel
o'zi uzatadi (`BACKEND_URL` va `MOD_API_KEY`).

Kalit maxfiy: klient modpackiga, umumiy manifestga, JAR ichiga yoki Gitga
joylamang. Klientlar rank ma'lumotlarini serverdan oladi va bu kalitga muhtoj
emas. Kalit berilmasa yoki backend qiymatiga mos kelmasa, backend 403 qaytaradi.

## API

Kod online o'yinchilar UUIDlarini bitta so'rovda yuboradi:

```http
POST /api/v1/rewards/player-ranks/
Content-Type: application/json
X-CyberCraft-Key: <server kaliti>
```

So'rov tanasi: `{"uuids":["<o'yinchi UUID>"]}`. Javob UUID bo'yicha
`rank`, `color_code` va `priority` maydonlarini qaytaradi; backendda yo'q
o'yinchilar javobga kiritilmaydi.

Server vanilla TAB prefikslarini scoreboard orqali ko'rsatadi. Klientdagi
mod qo'shimcha nishonlar, nameplate, ranklar oynasi va HUD uchun ishlatiladi;
klientda bu mod bo'lmasa ham serverga ulanish mumkin.

Reliz tekshiruvlari: [RELEASE.md](../docs/RELEASE.md).
