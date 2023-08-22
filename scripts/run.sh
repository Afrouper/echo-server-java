#!/bin/bash

echo "Start java application ${JAVA_APP_JAR}"

FOLDER=`dirname ${JAVA_APP_JAR}`
JAR_FILE=`basename ${JAVA_APP_JAR}`
cd ${FOLDER}

PARAMS=""
if [ -z "${JAVA_OPTS}" ]
then
  echo "Not using any Java Opts"
else
  PARAMS=${JAVA_OPTS}
  echo "Using Java Opts ${PARAMS}"
fi

java -jar ${JAR_FILE} ${PARAMS}