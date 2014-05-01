#!/bin/bash

. config.sh

if [ "$#" -eq 0 ]; then
	echo "Usage: transform-one.sh filename"
	exit 1
fi

filename=$1
first=$2
executable="timeout -s KILL 10m ./transform-model.sh -instanceModelPath $filename"

if $first; then
	executable="$executable -first"
fi

run="$executable -task [t2][t3][et1a][et1b]"
echo $run
$run 2>> results-t2.csv | tee -a results.txt

# restore
for k in 3 4 5; do
	run="$executable -task [et2][et3][et4a][et4b] -cliques $k"
	echo $run
	$run 2>> results-clique-$k.csv | tee -a results.txt
done

