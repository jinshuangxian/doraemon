package com.shadowell.doraemon.flink.core;

import com.shadowell.doraemon.core.connectors.kafka.KafkaConfig;
import com.shadowell.doraemon.core.connectors.kafka.KafkaOptions;

import java.util.Properties;

/**
 * Author: Jie Feng
 * Date: Created in 2019/12/16
 */
public class KafkaProperties {


    public static Properties getConsumerProperties(KafkaConfig kafkaConfig) {

        Properties sourceProperties = new Properties();
        sourceProperties.setProperty(KafkaOptions.BOOTSRAP_SERVER, kafkaConfig.getBootstrapServers());
        sourceProperties.setProperty(KafkaOptions.ENABLE_AUTO_COMMIT, "true");
        sourceProperties.setProperty(KafkaOptions.GROUP_ID, "flink-engine-rule");
        sourceProperties.setProperty(KafkaOptions.AUTO_OFFSET_RESET, "latest");
        return sourceProperties;

    }

    public static Properties getProducerProperties(KafkaConfig kafkaConfig) {
        Properties sinkProperties = new Properties();
        sinkProperties.setProperty(KafkaOptions.BOOTSRAP_SERVER, kafkaConfig.getBootstrapServers());
        sinkProperties.setProperty(KafkaOptions.AUTO_OFFSET_RESET, "latest");
        return sinkProperties;
    }
}
