# AI Hints

* Simple Java based echo server
* Uses latest quarkus framework
* Uses latest Java LTS version
* Creates an Java JAR and a graalVM native image version
* Dependabot and Actions running and merging updates automatically

## Project Structure
* scripts
  * Scripts for building or running the application
* src
  * Java source code; maven style
* Dockerfile.native
  * Creates an image containing the application as graalVM native image
* Dockerfile.jvm
  * Creates an image which jvm embedded
* .github
  * GitHub Actions and automations