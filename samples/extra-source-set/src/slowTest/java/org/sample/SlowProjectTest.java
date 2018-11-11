package org.sample;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SlowProjectTest {

    public static final Logger LOGGER = LoggerFactory.getLogger(SlowProjectTest.class);

    @Test
    public void createProject() throws Exception {
        LOGGER.info("Starting test");
        Thread.sleep(5000);
        Project project = new Project("Test project");
        assertThat(project.getName(), is("Test project"));
        LOGGER.info("Finishing test");
    }
}
