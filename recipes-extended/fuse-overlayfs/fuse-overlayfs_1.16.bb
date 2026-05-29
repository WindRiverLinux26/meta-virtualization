SUMMARY = "FUSE implementation of overlayfs."
DESCRIPTION = "An implementation of overlay+shiftfs in FUSE for rootless \
containers."

LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRCREV = "9ad6545b25934cd74f9cce4109a022be2c2492cd"
SRC_URI = "git://github.com/containers/fuse-overlayfs.git;nobranch=1;protocol=https"

DEPENDS = "fuse3"

inherit autotools pkgconfig
