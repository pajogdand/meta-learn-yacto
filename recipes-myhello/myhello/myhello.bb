DISCRIPTION="recipe for hello c file"
LICENSE="CLOSED"

SRC_URI="file://userprog.c"

S="${WORKDIR}"

do_compile(){
  cd ${S}
  $CC ${LDFLAGS} userprog.c -o userprog
}

do_install(){
  install -d ${D}/usr/bin
  install -m 777 ${S}/userprog ${D}/usr/bin/
}

INSANE_SKIP_${PN} = "LDFLAGS"
