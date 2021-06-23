DESCRIPTION = "Simple helloworld application for dyanamic library"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://arith.c \
	   file://print.c \
           file://mylib.h \
"


S = "${WORKDIR}"
LDFLAGS="-m32"
do_compile() {
	bbnote "compilation started"
	${CC} -fPIC -c arith.c
        ${CC} -fPIC -c print.c
        bbnote "generating the dynamic library"
        #gcc ${LDFLAGS} -shared -Wl,-soname,liblwl.so.1 -Wcpp -o liblwl.so.1.0 *.o
        ${CC} ${LDFLAGS} -shared -o liblwl.so *.o
        bbnote "compilation ended"
}	

do_install() {
	bbwarn "compilation started"
	install -d ${D}${libdir}
	install -m 0755 liblwl.so ${D}${libdir}
	install -d ${D}${includedir}
	install -m 0755 mylib.h ${D}${includedir}
	bbwarn "compilation ended"
}

SOLIBS = "*.so"
FILES_SOLIBSDEV = ""
