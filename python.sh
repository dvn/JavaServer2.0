#!/bin/sh
# after running `python sss.py` in Vagrant per https://github.com/dvn/swordpoc
curl -s -H "X-On-Behalf-Of: obo" http://sword:sword@localhost:8888/sd-uri | xmllint --format - | head -19
