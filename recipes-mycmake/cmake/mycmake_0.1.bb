DISCRIPTION="recipe for cmake"
LICENSE="CLOSED"

SRC_URI="file://userprog.c \
         file://CMakeLists.txt"

S="${WORKDIR}"

inherit cmake
