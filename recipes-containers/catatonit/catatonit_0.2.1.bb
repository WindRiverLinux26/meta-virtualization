# SPDX-FileCopyrightText: Huawei Inc.
#
# SPDX-License-Identifier: MIT

SUMMARY = "A container init that is so simple it's effectively brain-dead."
HOMEPAGE = "https://github.com/openSUSE/catatonit"
DESCRIPTION = "${SUMMARY}"
SECTION = "base"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "git://github.com/openSUSE/${BPN};protocol=https;branch=main"
SRCREV = "bb3b96b99668e544618c5aec427c1f4b6b9ee9bb"

inherit autotools
