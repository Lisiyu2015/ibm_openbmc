FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI += " \
            file://phosphor-multi-gpio-monitor.json \
            file://phosphor-multi-gpio-presence.json \
           "

FILES:${PN}-monitor += " \
                        ${datadir}/${PN}/phosphor-multi-gpio-monitor.json \
                       "

FILES:${PN}-presence += " \
                         ${datadir}/${PN}/phosphor-multi-gpio-presence.json \
                        "

do_install:append() {
    install -d ${D}${bindir}
    install -m 0644 ${UNPACKDIR}/phosphor-multi-gpio-monitor.json ${D}${datadir}/${PN}/
    install -m 0644 ${UNPACKDIR}/phosphor-multi-gpio-presence.json ${D}${datadir}/${PN}/
}
