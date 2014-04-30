#!/bin/bash

. config.sh

rm results*.csv

first=true

# synthetic
for n in $sizes; do
	./transform-one.sh hu.bme.mit.ttc.imdb.instance/model/synthetic-$n.movies $first
	first=false
done

# IMDb movies
cd $imdb_location
for f in *.movies; do
	./transform-one.sh $f
done
