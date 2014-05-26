#!/bin/bash

. config.sh

if $first; then
	executable="$executable -first"
fi

if $save; then
	executable="$executable -save"
fi

run="$executable -task [t2][t3]"
echo $run
$run 2>> results-$model-couple.csv | tee -a results-$model.txt

# restore
for k in 3 4 5; do
	run="$executable -task [et2][et3] -cliques $k"
	echo $run
	$run 2>> results-$model-clique-$k.csv | tee -a results-$model.txt
done

