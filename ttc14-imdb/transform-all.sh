#!/bin/bash

. config.sh

rm results*.*

export first=true
if $synthetic; then
    export model=synthetic
    for n in $sizes; do
	export executable="timeout -s KILL 10m ./transform-model.sh -N $n"

	./transform-one.sh
	export first=false
    done
fi

export first=true
if $imdb; then
    export model=imdb
    for f in $imdb_location/*.movies; do
	export executable="timeout -s KILL 10m ./transform-model.sh -instanceModelPath $f"
	
	./transform-one.sh
	export first=false
    done
fi
