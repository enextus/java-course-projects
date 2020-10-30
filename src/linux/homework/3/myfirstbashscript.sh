#!/bin/bash

#var USER2 will be created
USER2=Eduard
# print date
echo -n Today is:; date;
# print hello
echo Hello $USER2!;
# print working directory
echo -n Working directory:; pwd;
# print number of processes
ps -ef | tail +2 | wc -l
# print number of bioset process
ps -ef | grep bioset | tail +2 | wc -l
# print chmod of bioset process /etc/passwd
ls -la /etc/passwd | awk {'print $1'}


