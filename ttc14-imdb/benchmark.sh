#!/bin/bash

. config.sh

./restore-synthetic-models.sh
./restore-imdb-models.sh
./transform-all.sh
