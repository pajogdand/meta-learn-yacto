DESCRIPTION = "Simple helloworld application"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://userprog.c \
		  file://ReadMe.Txt"

SRC_URI_append = " file://function.c"

S = "${WORKDIR}"

do_compile() {
	bbnote "compilation started"
	${CC} userprog.c function.c ${LDFLAGS} -o userprog
	bbnote "compilation ended"
}	

do_install() {
	bbwarn "compilation started"
	install -d ${D}${bindir}
	install -m 0755 userprog ${D}${bindir}
	install -d ${D}${docdir}
	install -m 0755 ReadMe.Txt ${D}${docdir}
	bbwarn "compilation ended"
}

