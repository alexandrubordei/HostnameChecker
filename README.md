## Hostname Checker ##

Used as a debugging tool for Hadoop's hostname issues. (Returns the canonical hostname as well as reverse).

To compile
```
mvn package
```
to execute with maven:
```
mvn exec:java -Dexec.mainClass="com.bigstep.HostnameChecker"
```
To execute without maven (directly):
```
java -jar HostnameChecker-1.0-SNAPSHOT.jar

```

The binary jar file is also provided for convenience at 
https://github.com/alexandrubordei/HostnameChecker/blob/master/target/HostnameChecker-1.0-SNAPSHOT.jar?raw=true

