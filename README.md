# Gradle issue 22480 reproducer

See https://github.com/gradle/gradle/issues/22480

There are two actions, both run "clean build". The first one is successful, but the second fails.
This is most likely due to memory leak in Gradle daemon for Groovy compiler.

