#!/bin/bash

sizes="1 10 100 1000"

for n in $sizes; do

	java -jar hu.bme.mit.ttc.imdb.generator/target/hu.bme.mit.ttc.imdb.generator-1.0.0-SNAPSHOT.jar -instanceModel /home/szarnyasg/git/ttc14-eiq/ttc14-imdb/hu.bme.mit.ttc.imdb.instance/model/synthetic-$n.movies -N $n
	java -jar hu.bme.mit.ttc.imdb.transformation/target/hu.bme.mit.ttc.imdb.transformation-1.0.0-SNAPSHOT.jar -instanceModel /home/szarnyasg/git/ttc14-eiq/ttc14-imdb/hu.bme.mit.ttc.imdb.instance/model/synthetic-$n.movies -N $n

done
