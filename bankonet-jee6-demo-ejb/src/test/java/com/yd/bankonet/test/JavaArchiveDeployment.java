package com.yd.bankonet.test;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;

/**
 *
 * Created by ydechmi on 21/02/2015.
 */
public class JavaArchiveDeployment {


    @Deployment
    public static org.jboss.shrinkwrap.api.spec.JavaArchive createDeployment() {

        org.jboss.shrinkwrap.api.spec.JavaArchive archive=ShrinkWrap.create(org.jboss.shrinkwrap.api.spec.JavaArchive.class);
        archive.addPackage("com/yd/bankonet/dao/reference");
        archive.addPackage("com/yd/bankonet/dao/users");
        archive.addPackage("com/yd/bankonet/service/datas");
        archive.addAsResource("test-persistence.xml", "META-INF/persistence.xml");
        archive.addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
        return archive;
    }

}
