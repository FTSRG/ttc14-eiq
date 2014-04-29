#!/bin/bash

. config.sh

for n in $sizes; do
	timeout -s KILL 10m ./transform-one.sh hu.bme.mit.ttc.imdb.instance/model/synthetic-$n.movies
done
