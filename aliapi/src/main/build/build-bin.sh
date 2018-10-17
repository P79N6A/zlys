#!/usr/bin/env bash
sed -i 's/${project.finalName}/$1/g' ../bin/start.sh
sed -i 's/${project.finalName}/$1/g' ../bin/shutdown.sh
