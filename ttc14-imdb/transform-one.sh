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

$executable -task t2 2>> results-t2.csv
$executable -task t3 2>> results-t3.csv
$executable -task et1a 2>> results-et1a.csv
$executable -task et1b 2>> results-et1b.csv
$executable -task et2 -cliques 3 2>> results-et2-3.csv
$executable -task et2 -cliques 4 2>> results-et2-4.csv
$executable -task et2 -cliques 5 2>> results-et2-5.csv
$executable -task et3 2>> results-et3.csv
$executable -task et4a -cliques 3 2>> results-et4a-3.csv
$executable -task et4a -cliques 4 2>> results-et4a-4.csv
$executable -task et4a -cliques 5 2>> results-et4a-5.csv
$executable -task et4b -cliques 3 2>> results-et4b-3.csv
$executable -task et4b -cliques 4 2>> results-et4b-4.csv
$executable -task et4b -cliques 5 2>> results-et4b-5.csv
