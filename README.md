# echo-server

Simple echo service written in java with quarkus.

## Build Java
```shell
mvn clean package
docker build -Dockerfile.jvm . -t echo-server-java
docker run --rm -p8080:8080 echo-server-java
```

## Build native-image
```shell
mvn -Pnative clean package
docker build -f Dockerfile.native . -t echo-server-java
docker run --rm -p8080:8080 echo-server-java
```
