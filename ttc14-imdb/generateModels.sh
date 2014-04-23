#!/bin/bash

sizes="1000 2000 3000 4000 5000 10000 50000 100000 200000"

vmargs="-XX:MaxPermSize=256m -Xms5G -Xmx5G -XX:+UseCompressedOops"

for n in $sizes; do

  echo $n
  timeout -s KILL 5m \
  java $vmargs -jar hu.bme.mit.ttc.imdb.generator/target/hu.bme.mit.ttc.imdb.generator-1.0.0-SNAPSHOT.jar \
       -instanceModelDir ./hu.bme.mit.ttc.imdb.instance/model -N $n

done
