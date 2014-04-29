#!/bin/bash

. config.sh

rm results*.csv

first=true

for n in $sizes; do
	./transform-one.sh hu.bme.mit.ttc.imdb.instance/model/synthetic-$n.movies $first
	first=false
done
