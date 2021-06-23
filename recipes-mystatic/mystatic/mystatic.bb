DESCRIPTION = "Simple helloworld application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://arith.c \
	   file://print.c \
           file://mylib.h \
"


S = "${WORKDIR}"

do_compile() {
	bbnote "compilation started"
	${CC} -c arith.c
        ${CC} -c print.c
        bbnote "generating the static library"
        ar rcs liblwl.a print.o arith.o
        bbnote "compilation ended"
}	

do_install() {
	bbwarn "compilation started"
	install -d ${D}${libdir}
	install -m 0755 liblwl.a ${D}${libdir}
	install -d ${D}${includedir}
	install -m 0755 mylib.h ${D}${includedir}
	bbwarn "compilation ended"
}

ALLOW_EMPTY_${PN} = "1"
#FILES_${PN}-dbg += "${bindir}/userprog ${includedir}/ReadMe.Txt"
#FILES_${PN}-lwl += "${includedir}/ReadMe.Txt ${includedir}/ReadMe.Txt"

#PACKAGES = "${PN}-lwl"
