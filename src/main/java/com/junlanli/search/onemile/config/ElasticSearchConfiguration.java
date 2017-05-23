package com.junlanli.search.onemile.config;

import com.junlanli.search.onemile.dao.repository.custom.BaseESDao;
import com.junlanli.search.onemile.dao.repository.custom.impl.BaseESDaoImpl;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.repository.Repository;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Copyright (C) 2015 - 2017 JUNLAN LI All Rights Reserved.
 * <p>
 * Created on 17/05/2017.
 *
 * @author: lijunlan888@gmail.com
 */
@Configuration
@EnableElasticsearchRepositories(basePackages = "com.junlanli.search.onemile.dao.repository", repositoryBaseClass = BaseESDaoImpl.class)
public class ElasticSearchConfiguration {

    @Bean
    public Class<? extends Repository> repositoryClass() {
        return BaseESDao.class;
    }

    @Bean
    public ElasticsearchOperations elasticsearchTemplate() throws UnknownHostException {
        return new ElasticsearchTemplate(client());
    }

    @Bean
    public Client client() throws UnknownHostException {
        Settings settings = Settings.builder()
                .put("cluster.name", "junlanli").build();
        return TransportClient.builder().settings(settings).build()
                .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("www.junlanli.com"), 9300));
    }

}
