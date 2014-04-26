#!/bin/bash

if [ "$(expr substr $(uname -s) 1 6)" = "CYGWIN" ]; then
	separator=";"
else
	separator=":"
fi

java -cp "hu.bme.mit.ttc.imdb.generator/target/hu.bme.mit.ttc.imdb.generator-1.0.0-SNAPSHOT.jar"$separator"hu.bme.mit.ttc.imdb.generator/target/lib/*" hu.bme.mit.ttc.imdb.main.GeneratorMain -instanceModelDir hu.bme.mit.ttc.imdb.instance/model -N 1
