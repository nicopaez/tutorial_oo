#!/usr/bin/env sh
set -e

for dir in */;
do
    cd ${dir}
    ant
    cd ..
done

#cd ejerciciotemplate
#ant
#cd ../ejercicio1
#ant
