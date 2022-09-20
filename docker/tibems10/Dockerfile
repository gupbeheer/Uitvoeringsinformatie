FROM centos:centos7.9.2009

WORKDIR /tmp

## Getting the Tibco EMS community edition package:
# --
# Option 1:
# This link might expire.
ADD https://edownloads.tibco.com/Installers/tap/EMS-CE/10.1.0/TIB_ems-ce_10.1.0_linux_x86_64.zip?SJCDPTPG=1666253199_85bfaa73e582b3d4f765358eec59c62f&ext=.zip /tmp/tibcoems10.zip

# Option 2:
# Visit https://www.tibco.com/resources/product-download/tibco-enterprise-message-service-community-edition-free-download-0
# Or google tibcoems community edition Linux (Google finds windows version per default)
# Change the link from option 1 with your fresh link which gets the package.

# Option3
# Download the zip
# Unzip it
# Disable the ADD line from option 1
# Enable the following lines
#RUN mkdir -p /opt/tibco
# COPY rpm /tmp/tibco/rpm

#Install yum files
RUN yum install -y vim zip unzip \
    && unzip tibcoems10.zip
RUN yum install -y /tmp/TIB_ems-ce_10.1.0/rpm/*.rpm

# Verify
RUN yum list installed | grep "ems"

# set vars and extend path
ENV EMS_HOME /opt/tibco/ems/10.1
ENV PATH="$PATH:$EMS_HOME/bin"

#As per instructions, this post-install step is required.
RUN cd $EMS_HOME \
    && bin/post-install.sh

#prepare the ems server config based on provided samples
WORKDIR $EMS_HOME/samples/config
RUN mkdir datastore \
    && touch datastore/meta.db datastore/async-msgs.db datastore/sync-msgs.db \
    && chmod 777 -R datastore

CMD ["tibemsd", "-config", "tibemsd.conf"]
