# echo-server

Simple echo service written in java with quarkus.

It uses RedHat UBI images to get a trusted container environment

## Build Java
```shell
mvn package
docker build -Dockerfile.jvm . -t echo-server-java
docker run --rm -p8080:8080 echo-server-java
```

## Build native-image
```shell
mvn -Pnative package
docker build -f Dockerfile.native . -t echo-server-java
docker run --rm -p8080:8080 echo-server-java
```
