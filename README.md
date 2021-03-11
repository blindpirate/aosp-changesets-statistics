# AOSP Gerrit Crawler

This is a crawler to crawl ASOP Gerrit `/changes` API for further investigation.

## Usage

### Prerequisite

You have JDK 11 installed and `JAVA_HOME` set correctly.

### How to use

```
./gradlew run -Dsince=2015-01-01
```

This will save the JSONs from `/changes` API to `build/`, one file per day:

```
build 
|--- 2021-03-10.json
|--- 2021-03-09.json
...
```

