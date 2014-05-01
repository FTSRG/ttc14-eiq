#!/bin/bash

. config.sh

rm results*.*

first=true

if $synthetic; then
    for n in $sizes; do
	./transform-one.sh hu.bme.mit.ttc.imdb.instance/model/synthetic-$n.movies $first
	first=false
    done
fi

if $imdb; then
    for f in $imdb_location/*.movies; do
	./transform-one.sh $f
	first=false
    done
fi
