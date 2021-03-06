package com.shadowell.doraemon.flink.config;

import com.shadowell.doraemon.core.connectors.kafka.KafkaConfig;

/**
 * Author: Jie Feng
 * Date: Created in 2019/12/18
 */
public class SinkConfig {
	private KafkaConfig kafkaConfig;

	public KafkaConfig getKafka() {
		return kafkaConfig;
	}

	public void setKafka(KafkaConfig kafkaConfig) {
		this.kafkaConfig = kafkaConfig;
	}
}
