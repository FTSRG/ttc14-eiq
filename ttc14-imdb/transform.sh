#!/bin/bash

vmargs="-XX:MaxPermSize=256m -Xms5G -Xmx5G -XX:+UseCompressedOops"

if [ "$#" -eq 0 ]; then
        echo "Usage: transform.sh OPTIONS"
        echo "  OPTIONS: "
        echo "    -instanceModelPath: file path of the instance model"
        echo "    -instanceModelDir: directory of instance models. Use together with the -N option."
        echo "    -N NUMBER: file name will be synthetic-NUMBER.movies inside instanceModelDir"
        echo "    -task [t2|t3|et1a|et1b|et2|et3|et4a|et4b]"
        echo "    -cliques N: number of cliques for extension tasks 2-4"
        echo "    -printImmediately: print available benchmark resutls immediately, and do not wait for the whole trnasformation."
        exit 1
fi

java $vmargs -jar hu.bme.mit.ttc.imdb.transformation/target/hu.bme.mit.ttc.imdb.transformation-1.0.0-SNAPSHOT.jar $*
