DISCRIPTION="recipe for hello world autotools"
LICENSE="GPLv3+"
SRC_URI="git://github.com/stephane/libmodbus.git"
LIC_FILES_CHKSUM="file://COPYING.LESSER;md5=4fbd65380cdd255951079008b364516c"
SRCREV="31f779185d3d2a7b212b508ea321f4e449f3de85"

S="${WORKDIR}/git"

do_configure(){
	cd ${S}
        ./autogen.sh
        ./configure --prefix=/usr/ --host=i586-poky-linux-
}

do_compile(){
	cd ${S}
        make
}

do_install(){
	install -d ${D}/usr/lib
	install -d ${D}/usr/inlcude
	make install 
}
