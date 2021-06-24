DISCRIPTION="recipe for cmake"
LICENSE="CLOSED"

SRC_URI="file://userprog.c \
         file://CMakeLists.txt"

S="${WORKDIR}"

inherit cmake

#Copy userprog to /bin insteated of default /usr/bin/
EXTRA_OECMAKE = "-DCMAKE_INSTALL_PREFIX:PATH=/"
