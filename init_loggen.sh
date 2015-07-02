#!/bin/bash

export JAVA_HOME=/usr/lib/jvm/java-7-openjdk-amd64/
export PATH=${PATH}:${JAVA_HOME}/bin

export CLASSPATH=${HOME}/NonClut/gitwrk/Flume_pipe/log4j-1.2.17.jar:${HOME}/NonClut/gitwrk/Flume_pipe/

rm -f /tmp/LOGgen.log

dkrurl=`sudo docker inspect -f  '{{json .}}' dfc | jshon  -e NetworkSettings -e IPAddress | sed -e 's/"//g'`:50070

if wget $dkrurl ; then
	rm -f index.html
	java logGen $1
fi


