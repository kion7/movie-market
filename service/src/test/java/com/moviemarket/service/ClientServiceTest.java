package com.moviemarket.service;

import com.moviemarket.model.Client;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Maxim on 26.7.17.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:test-service-spring.xml"})
@Transactional
public class ClientServiceTest {

    private static final Logger LOGGER = LogManager.getLogger();

    @Autowired
    private ClientService clientService;


    private static final Client TEST_CLIENT =
            new Client(2, "user2", "111");

    @Test
    public void getClientTest() throws Exception {
        LOGGER.debug("getClientTest()");
        Client client = clientService.getClient("user2");
        Assert.assertEquals(TEST_CLIENT, client);
    }

    @Test
    public void addClientTest() throws Exception {
        LOGGER.debug("addClientTest()");
        Client client = new Client(null, "user333", "111");
        clientService.addClient(client);
        Client addedClient = clientService.getClient(client.getUsername());
        Assert.assertNotNull(addedClient);
        Assert.assertEquals(client.getUsername(), addedClient.getUsername());
        Assert.assertEquals(client.getPassword(), addedClient.getPassword());
    }
}
