#!/bin/bash

for i in {1..3}
do

	sleep .8s;

		# print date
		echo -n "Time now is: "; date | awk {'print $4'};

		# print number of processes
		echo -n "Processes number: "; ps -ef | tail +2 | wc -l;

		# print new line
		echo -e "\n";
		
		# write the processor information in to a file
		cat /proc/cpuinfo > processor_information.txt
		
		# write the os information in to a file
		cat /etc/os-release | head -1

		# write the os information in to a file (only os name)
		cat /etc/os-release | head -1 | awk -F = '$1=="NAME" {print$2}' > os_information.txt


done
