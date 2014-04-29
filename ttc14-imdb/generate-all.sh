#!/bin/bash

. config.sh

for n in $sizes; do

	echo $n
	./generate-model.sh -N $n

done
