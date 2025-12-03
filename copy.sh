#!/usr/bin/env bash

cp -r ${HYBRIS_BIN_DIR}/custom/sweets ${HYBRIS_HOME_DIR}/custom-extensions

cp -r ${HYBRIS_BIN_DIR}/custom/suppliers ${HYBRIS_HOME_DIR}/custom-extensions

cp ${HYBRIS_CONFIG_DIR}/localextensions.xml ${HYBRIS_HOME_DIR}/custom-extensions

