#!/bin/bash

# catch the interrupt signal

cleanup()
{
	return $?
}

control_c()
# run if user hits control-c
{
	echo -en "\nInterrupt received, exiting.\n"
	cleanup
	exit $?
}

# trap keyboard interrupt (control-c)
trap control_c SIGINT

if [ "$(expr substr $(uname -s) 1 6)" = "CYGWIN" ]; then
	export separator=";"
else
	export separator=":"
fi

# environment variables

export sizes="1000 2000 3000 4000 5000 10000 50000 100000 200000"
export vmargs="-XX:MaxPermSize=256m -Xms5G -Xmx5G -XX:+UseCompressedOops"
export imdb_location=~/data/imdb-models

[ -f config-override.sh ] && . config-override.sh
