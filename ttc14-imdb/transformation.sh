#!/bin/bash

java -cp hu.bme.mit.ttc.imdb.transformation/target/hu.bme.mit.ttc.imdb.transformation-1.0.0-SNAPSHOT.jar:hu.bme.mit.ttc.imdb.transformation/target/lib/* hu.bme.mit.ttc.imdb.main.TransformationMain -instanceModelPath /home/szarnyasg/git/ttc14-eiq/ttc14-imdb/hu.bme.mit.ttc.imdb.instance/model/synthetic-1.movies
