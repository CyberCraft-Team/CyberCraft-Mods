# Preparing mod releases

Build both projects with Java 21. Current source configuration:

| Project | Minecraft | NeoForge build version | Declared NeoForge minimum | Version / output JAR |
| --- | --- | --- | --- | --- |
| CC Ores | 1.21.1 | 21.1.215 | 21.1.215 | 1.0.0 / `ccores-1.0.0.jar` |
| cybercraftranks | 1.21.1 | 21.1.229 | 21.1.215 | 1.0.0 / `cybercraftranks-1.0.0.jar` |

These values come from each project's `gradle.properties` and mod metadata
template. The declared minimum is not proof of runtime compatibility;
test the exact NeoForge version used by the production server and launcher.
Both projects set `archivesName` to `mod_id` and `version` to `mod_version`,
so Gradle's JAR outputs are under the respective `build/libs/` directory.

## Build and retain

Run `./gradlew clean build` inside each project. Existing CI builds each
project separately, creates `SHA256SUMS` for its JARs, verifies the checksums,
and retains JARs plus checksums as GitHub Actions artifacts for 30 days.
Artifacts include the source commit in their names. They are build outputs,
not a published release.

After downloading and extracting an artifact, run inside the extracted directory:

```sh
sha256sum --check SHA256SUMS
```

Keep the verified JARs and checksums associated with the source revision.
When changing versions, update each affected `mod_version` before building.
Publishing a release or uploading JARs into production server/modpack records
is a separate authorized action.

## Production checks

Back up the Minecraft world before changing server mods. Check dedicated
server startup, mod loading, existing world loading, client connection, and
new CC Ores world generation with the exact production modpack. Check ranks
for known players, refresh behavior, vanilla TAB prefixes, and optional
client UI with and without the ranks client mod. A successful Gradle build
does not establish these behaviors.

For ranks, set server JVM properties `-Dcybercraft.api=<HTTPS backend origin>`
and `-Dcybercraft.key=<MOD_API_KEY>` before `-jar`. The API origin must omit
`/api/v1`: the mod appends `/api/v1/rewards/player-ranks/` itself and uses POST.
The CyberCraft-managed server process already injects these values from the
backend configuration. Keep the key only in server configuration; never put
it in client modpacks, shared manifests, release files, or committed code.
