#!/usr/bin/env bash

if [[ "$JAVA_HOME" == '' ]]; then
  echo "JAVA_HOME not set, sometimes this happen with jenv"
  echo "Running using jenv..."
  jenv exec bash <<HERE
  sh scripts/buildLocalNativeLibInternal.sh
HERE
else
  echo "JAVA_HOME is set"
  echo "Running..."
  sh scripts/buildLocalNativeLibInternal.sh
fi