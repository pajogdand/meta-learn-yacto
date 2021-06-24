DISCRIPTION="recipe for hello world autotools"
LICENSE="GPLv3+"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "https://ftp.gnu.org/gnu/hello/hello-2.10.tar.gz"
SRC_URI[md5sum] = "6cd0ffea3884a4e79330338dcc2987d6"

inherit autotools-brokensep gettext
EXTRA_OECONF += "--disable-nls"
