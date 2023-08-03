# echo-server

Simple echo service written in java with quarkus.

## Build Java
```shell
mvn package
docker build -f src/main/docker/Dockerfile.jvm . -t echo-server
docker run --rm -p8080:8080 echo-server
```

## Build native-image
```shell
mvn -Pnative package
docker build -f src/main/docker/Dockerfile.native . -t echo-server
docker run --rm -p8080:8080 echo-server
```
