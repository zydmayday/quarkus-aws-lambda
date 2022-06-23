# quarkus-aws-lambda

## jvm version

```shell
$ mvn clean package
$ sls deploy # need to change serverless, see first commit
```

## native version

```shell
$ mvn package -Dnative -Dquarkus.native.container-build=true 
$ sls deploy
```

native version is faster than jvm version.
2000ms(jvm) vs 250ms(native)