# PEPOYOMod-Spawn-Control
IMPORTANT: This is a reconstruction based on the previously shared Forge MDK,
working build.gradle and known working project structure. It is NOT a byte-for-byte
copy of the deleted directory; the exact Mixin source was reconstructed.

Restore steps:
1. Extract all files, open this folder as a Gradle project in IntelliJ IDEA.
2. Copy your original PEPOYO mod to the libs folder.
3. Run .\gradlew clean build in IDEA's Windows PowerShell terminal.
4. The generated addon JAR is in build\libs.

Functions:
- Disables biome-based natural spawning of pepoyo:debtcollector and pepoyo:yorupo.
- Cancels YorupoasuraEntity.init() raid registration, keeping pepoyo:yorupoasura
  out of raids, while not removing the entity itself.
- Special spawn methods such as /summon and spawn eggs remain untouched.

Original Pepoyo JAR is a dependency and must be supplied separately.
