#!/usr/bin/env bash

echo "JAVA_HOME=$JAVA_HOME"

cmake -Butils/.cxx/cmake -Sutils/src/main/cpp &&
  cd utils/.cxx/cmake &&
  make &&
  mv ./libradiantstodegrees.dylib ../../libradiantstodegrees.dylib

echo "Done"