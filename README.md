# Minimal viable SWORD v2 server implemented in Java

This repo is based on https://github.com/swordapp/JavaServer2.0 but implements required interfaces.

* java1.sh: retrieves service document
* java2.sh: "deposits" example.zip to /tmp/SWORD-73211f25-1bf6-4af3-a78f-55c37cd91cca (or similar, check server logs) where it is purposely not deleted for now
* python.sh: like java1.sh but operates against an instance of the SWORD v2 Python reference implementation (Simple SWORD Server) spun up with Vagrant using https://github.com/dvn/swordpoc
