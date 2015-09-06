# gizmojc
Tools to put  data about web pages in a MySQL database

By Jean-Claude Parent


These classes take a text file containing web url, access the page to get the rea; url, title and so on  and create MySQL command to load the data in MySQL tables,
This project is also used to explore how to make the junit test run  with minimal installation. The goal is to clone the projet and run it as is without setup. A test suite that can run without setup of the computer  exist. Test that need external ressources will be in another test suite.


Some of the code was created infrench so somme comment and variable names are in french.

The project is intended to run on Mac OS/X and linux.
Some comment may seems to have no use but are intendedn to allow visually impaired  people to understand the code.

===============
version 1.0

Method: WFFRunner

A command line method that read a texte file containing urls, and write a file containing only the urls, one by line. 

Usage in a unix script:
============

java -cp /GizmoJC/PROD/bin/java/ net.noursicain.gizmojc/EFFRunner /GizmoJC/PROD/WORK/xpert1/URLExtract_in.txt /GizmoJC/PROD/WORK/xpert1/URLExtract_out.txt  >> /GizmoJC/PROD/journal/run_XPrt1_01_chaineLoadSQL.txt
if [ "$?" = "0" ]; then
#do something with the file
else
echo error message
exit 99
fi
====================
This script must be changed to match your file system. (where are the class and the files to process)