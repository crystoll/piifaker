#!/bin/bash

./mvnw clean package
java --enable-preview -jar target/piifaker-0.0.1-SNAPSHOT.jar
