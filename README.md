BatchDemo

### How to run only one batch with maven ###
* mvn spring-boot:run -Drun.arguments="--Batch1"
* mvn spring-boot:run -Drun.arguments="--Batch2"

### How to run only one batch with jar ###
* java -jar target/demo-0.0.1-SNAPSHOT.jar --Batch1
* java -jar target/demo-0.0.1-SNAPSHOT.jar --Batch2
