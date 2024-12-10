SUMMARY = "A rigid, lightweight, dead-simple intent parser"
HOMEPAGE = "https://github.com/MycroftAI/padaos"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;md5=b51c3e8e53a7cd95c13c5aab6cbc8e67"

SRC_URI[sha256sum] = "2ac05fcbc826873c574568aa5ce09945d6ea987bee10399e766eb8f7c6356d72"

inherit pypi setuptools3

RDEPENDS:${PN} += "python3-logging"
