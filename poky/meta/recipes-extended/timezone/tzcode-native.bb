require timezone.inc

SUMMARY = "tzcode, timezone zoneinfo utils -- zic, zdump, tzselect"

inherit native

EXTRA_OEMAKE += "CC='${CC}'"

do_install () {
        install -d ${D}${bindir}/
        install -m 755 zic ${D}${bindir}/
        install -m 755 zdump ${D}${bindir}/
        install -m 755 tzselect ${D}${bindir}/
}
