DESCRIPTION = "Awesome pattern library"
SECTION = "NetileCorp"
LICENSE = "LGPL-3.0"
DEPENDS = "pattern-lib"

LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d32239bcb673463ab874e80d47fae504 \
                    file://LICENSE.LESSER.txt;md5=e6a600fd5e1d9cbde2d983680233ad02"

PR = "r6"

SRC_URI = "git://github.com/Digers/PatternTester.git;protocol=git;tag=dev"
S = "${WORKDIR}/git/"

do_install() {
   make install DESTDIR="${D}"
}

