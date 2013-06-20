#!/bin/sh
curl -s -H "X-On-Behalf-Of: obo" http://sword:sword@localhost:8080/JavaServer2.0/servicedocument \
#| xmllint --format -
