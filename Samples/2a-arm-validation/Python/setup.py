# coding=utf-8
# --------------------------------------------------------------------------
# Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------
# coding: utf-8

from setuptools import setup, find_packages

NAME = "storagemanagementclient"
VERSION = "2015-06-15"

# To install the library, run the following
#
# python setup.py install
#
# prerequisite: setuptools
# http://pypi.python.org/pypi/setuptools

REQUIRES = ["msrestazure>=0.4.7"]

setup(
    name=NAME,
    version=VERSION,
    description="StorageManagementClient",
    author_email="",
    url="",
    keywords=["Swagger", "StorageManagementClient"],
    install_requires=REQUIRES,
    packages=find_packages(),
    include_package_data=True,
    long_description="""\
    The Storage Management Client.
    """
)
