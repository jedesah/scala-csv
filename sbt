#!/bin/sh
java -Dsbt.log.noformat=true -Xdebug -Xmx2048M -XX:+CMSClassUnloadingEnabled -XX:PermSize=256M -jar ./sbt-launch-0.11.jar "$@"
