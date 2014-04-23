#!/bin/bash

vmargs="-XX:MaxPermSize=256m -Xms5G -Xmx5G -XX:+UseCompressedOops"
sizes="1000 2000 3000 4000 5000 10000 50000 100000 200000"

for n in $sizes; do
  timeout -s KILL 5m \
          java $vmargs -jar hu.bme.mit.ttc.imdb.transformation/target/hu.bme.mit.ttc.imdb.transformation-1.0.0-SNAPSHOT.jar \
          -instanceModelDir ./hu.bme.mit.ttc.imdb.instance/model -N $n -task 2 # -cliques 3
done
