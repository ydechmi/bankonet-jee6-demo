package com.yd.bankonet.dao.reference;

import com.yd.bankonet.domaine.reference.Language;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ejb.EJB;


@RunWith(Arquillian.class)
public class LanguageDaoBeanTest {

    @EJB
    LanguageDaoBean languageDaoBean;

    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(LanguageDaoBean.class)
                .addAsResource("test-persistence.xml", "META-INF/persistence.xml")
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
}
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testGetEntityClass() throws Exception {
        Assert.assertEquals(Language.class,languageDaoBean.getEntityClass());
    }

    @Test
    public void testGetEntityManager() throws Exception {
        Assert.assertNotNull(languageDaoBean.getEntityManager());
    }

    @Test
    public void testPersist() throws Exception {
        Language language=new Language("FR","French");
        languageDaoBean.persist(language);
        Assert.assertNotNull(language.getId());
        languageDaoBean.removeById(language.getId());
    }

    @Test
    public void testRemoveById() throws Exception {
        Language language=new Language("FR","French");
        languageDaoBean.persist(language);
        Integer id=language.getId();
        System.out.println("id entity:" + id);
        Assert.assertNotNull(id);
        languageDaoBean.removeById(id);
        Assert.assertNull(languageDaoBean.findById(id));
    }

    @Test
    public void testUpdate() throws Exception {
        Language language=new Language("FR","French");
        languageDaoBean.persist(language);
        Integer id=language.getId();
        System.out.println("id entity:" + id);
        Assert.assertNotNull(id);
        Language entity=languageDaoBean.findById(id);
        entity.setCode("EN");
        entity.setLabel("English");
        languageDaoBean.update(entity);
        Language result=languageDaoBean.findById(id);
        Assert.assertEquals("EN",result.getCode());
        Assert.assertEquals("English",result.getLabel());
        languageDaoBean.removeById(result.getId());
    }

    @Test
    public void testFindById() throws Exception {
        Language language=new Language("FR","French");
        languageDaoBean.persist(language);
        Integer id=language.getId();
        System.out.println("id entity:" + id);
        Assert.assertNotNull(id);
        Language entity=languageDaoBean.findById(id);
        Assert.assertNotNull(entity);
        languageDaoBean.removeById(entity.getId());
    }
}