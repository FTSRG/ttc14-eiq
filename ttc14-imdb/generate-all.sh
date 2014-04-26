#!/bin/bash

. config.sh

for n in $sizes; do

	echo $n
	#timeout -s KILL 5m \
	./generate-model.sh -N $n

done
