#!/bin/bash

. config.sh

for n in $sizes; do
	timeout -s KILL 5m ./transform-model.sh -instanceModelDir hu.bme.mit.ttc.imdb.instance/model -N $n -task 2 # -cliques 3
done
