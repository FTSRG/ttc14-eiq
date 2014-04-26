#!/bin/bash

. config.sh

if [ "$#" -eq 0 ]; then
	echo "Usage: transform.sh OPTIONS"
	echo "  OPTIONS: "
	echo "    -instanceModelPath: file path of the instance model"
	echo "    -task [t2|t3|et1a|et1b|et2|et3|et4a|et4b]: task 2, task 3, extension task 1/a, etc."
	echo "    -cliques N: number of cliques for extension tasks 2-4"
	echo "    -printImmediately: print available benchmark results immediately, and do not wait for the whole transformation."
	exit 1
fi

java $vmargs -cp "hu.bme.mit.ttc.imdb.transformation/target/hu.bme.mit.ttc.imdb.transformation-1.0.0-SNAPSHOT.jar"$separator"hu.bme.mit.ttc.imdb.transformation/target/lib/*" hu.bme.mit.ttc.imdb.main.TransformationMain $*
