# -*- mode: Conf; -*-
inherit setuptools3
require aws-iot-device-sdk-python-v1.inc
SRC_URI += "file://0001-Replace-distutils-with-setuptools.patch"
