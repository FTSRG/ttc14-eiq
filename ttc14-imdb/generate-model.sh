#!/bin/bash

. config.sh

if [ "$#" -eq 0 ]; then
	echo "Usage: generateModel.sh OPTIONS"
	echo "  OPTIONS: "
	echo "    -N NUMBER: generate file with size N under hu.bme.mit.ttc.imdb.generator/model/synthetic-NUMBER.movies"
	exit 1
fi


while [ "$1" != "" ]; do
	case $1 in
		"-N")
		shift
		N=$1
		;;
	esac
	shift
done

vmargs="-XX:MaxPermSize=256m -Xms1G -Xmx5G -XX:+UseCompressedOops"

java $vmargs -cp "hu.bme.mit.ttc.imdb.generator/target/hu.bme.mit.ttc.imdb.generator-1.0.0-SNAPSHOT.jar"$separator"hu.bme.mit.ttc.imdb.generator/target/lib/*" hu.bme.mit.ttc.imdb.main.GeneratorMain -instanceModelDir hu.bme.mit.ttc.imdb.instance/model -N $N
