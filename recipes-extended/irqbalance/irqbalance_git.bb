#
# Copyright (C) 2015 Wind River Systems, Inc.
#

require irqbalance.inc

SRCREV = "cf763968dc221be2ce36e1dce45b6f9d998b40c6"
PV = "1.9.5+git"

SRC_URI = "git://github.com/Irqbalance/irqbalance;branch=master;protocol=https \
           file://add-initscript.patch \
           file://irqbalance-Add-status-and-reload-commands.patch \
          "

CFLAGS += "-Wno-error=format-security"
