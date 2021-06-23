DISCRIPTION="recipe for hello c file"
LICENSE="CLOSED"

SRC_URI="file://userprog.c"

S="${WORKDIR}"

DEPENDS = "mystatic"
#LDFLAGS="-m32"

do_compile(){
  ${CC} userprog.c ${LDFLAGS} -o userprog -llwl
}

do_install(){
  install -d ${D}/usr/bin
  install -m 777 ${S}/userprog ${D}/usr/bin/
}

#INSANE_SKIP_${PN} = "LDFLAGS"
