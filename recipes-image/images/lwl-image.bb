require recipes-core/images/core-image-minimal.bb

IMAGE_INSTALL_append = " mycmake"
IMAGE_FEATURES_append = " splash"
