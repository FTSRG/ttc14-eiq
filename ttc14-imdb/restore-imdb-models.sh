#!/bin/bash

. config.sh

rm -rf $imdb_location
cp -r $imdb_original_location $imdb_location
